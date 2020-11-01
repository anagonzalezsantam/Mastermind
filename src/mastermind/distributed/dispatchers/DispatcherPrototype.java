package mastermind.distributed.dispatchers;

import java.util.HashMap;
import java.util.Map;
import utils.TCPIP;

public class DispatcherPrototype {

	private TCPIP tcpip;
	private Map<FrameType, Dispatcher> dispatcherMap;
	
	public DispatcherPrototype() {
		this.tcpip = TCPIP.createServerSocket();
		this.dispatcherMap = new HashMap<FrameType, Dispatcher>();
	}
	
	public void add (FrameType frameType, Dispatcher dispatcher) {
		this.dispatcherMap.put(frameType, dispatcher);
		if(dispatcher != null) {
			dispatcher.associate(this.tcpip);
		}
	}

	public void serve() {
		Dispatcher dispatcher ;
		do {
			String string = this.tcpip.receiveLine();
			FrameType frameType = FrameType.parser(string);
			dispatcher = this.dispatcherMap.get(frameType);
			if (dispatcher != null) {
				dispatcher.dispatch();
			}
		} while (dispatcher != null);

		this.tcpip.close();		
	}

}

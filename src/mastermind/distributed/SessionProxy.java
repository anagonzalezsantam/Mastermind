package mastermind.distributed;

import mastermind.distributed.dispatchers.FrameType;
import mastermind.models.Session;
import mastermind.models.StateValues;
import utils.TCPIP;

public class SessionProxy extends Session {

	private TCPIP tcpip;
	
	public SessionProxy(TCPIP tcpip) {
		super();
		this.tcpip = tcpip;
	}
	
	public StateValues getStateValue() {
		this.tcpip.send(FrameType.STATE.name());
		return StateValues.values()[this.tcpip.receiveInt()];
	}
}

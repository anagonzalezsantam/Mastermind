package mastermind.distributed;

import mastermind.controllers.Logic;
import mastermind.distributed.dispatchers.FrameType;
import mastermind.models.StateValues;
import utils.TCPIP;

public class LogicProxy extends Logic {

	private TCPIP tcpip;
	
	public LogicProxy() {
		this.tcpip = TCPIP.createClientSocket();
		this.session = new SessionProxy(this.tcpip);
		this.controllers.put(StateValues.INITIAL, new StartControllerProxy(this.session,this.tcpip));
		this.controllers.put(StateValues.GAME, new PlayControllerProxy(this.session,this.tcpip));
		this.controllers.put(StateValues.FINISH, new ResumeControllerProxy(this.session,this.tcpip));
		this.controllers.put(StateValues.EXIT, null);
	}
	
	public void close() {
		this.tcpip.send(FrameType.CLOSE.name());
		this.tcpip.close();
	}

}

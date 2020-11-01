package mastermind.distributed;

import mastermind.controllers.StartController;
import mastermind.distributed.dispatchers.FrameType;
import mastermind.models.Session;
import utils.TCPIP;

public class StartControllerProxy extends StartController {

	private TCPIP tcpip;

	public StartControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}
	
	public void start() {
		this.tcpip.send(FrameType.START.name());
	}
	
}

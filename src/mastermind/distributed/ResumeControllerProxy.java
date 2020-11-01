package mastermind.distributed;

import mastermind.controllers.ResumeController;
import mastermind.distributed.dispatchers.FrameType;
import mastermind.models.Session;
import utils.TCPIP;

public class ResumeControllerProxy extends ResumeController {

	private TCPIP tcpip;
	
	public ResumeControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}
	
	public void reset(boolean isResume) {
		this.tcpip.send(FrameType.RESUME.name());
		this.tcpip.send(isResume);
	}
}

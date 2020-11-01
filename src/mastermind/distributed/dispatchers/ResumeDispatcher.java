package mastermind.distributed.dispatchers;

import mastermind.controllers.ResumeController;

public class ResumeDispatcher extends Dispatcher {

	private ResumeController resumeController;
	
	public ResumeDispatcher(ResumeController resumeController) {
		this.resumeController = resumeController;
	}

	public void dispatch() {
		boolean isResumed = this.tcpip.receiveBoolean();
		this.resumeController.reset(isResumed);
	}

}

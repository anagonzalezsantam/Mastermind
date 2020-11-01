package mastermind.distributed.dispatchers;

import mastermind.controllers.ResumeController;

public class ResumeDispatcher extends Dispatcher {

	public ResumeDispatcher(ResumeController resumeController) {
		super(resumeController);
	}

	public void dispatch() {
		boolean isResumed = this.tcpip.receiveBoolean();
		((ResumeController)this.acceptorController).reset(isResumed);
	}

}

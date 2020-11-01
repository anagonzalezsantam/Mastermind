package mastermind.controllers.implementation;

import mastermind.controllers.ResumeController;
import mastermind.models.Session;

public class ResumeControllerImplementation extends ResumeController {
	
	public ResumeControllerImplementation(Session session) {
		super(session);
	}

	public void reset(boolean isResume) {
		if(isResume) {
			this.session.reset();							
		} else {
			this.session.next();
		}
	}
}

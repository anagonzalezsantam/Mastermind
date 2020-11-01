package mastermind.controllers;

import mastermind.distributed.dispatchers.FrameType;
import mastermind.models.Session;

public class ResumeController extends Controller implements AcceptorController {

	public ResumeController(Session session) {
		super(session);
	}

	public void reset(boolean isResume) {
		if(this.session.isStandalone()) {
			if(isResume) {
				this.session.reset();							
			} else {
				this.session.next();
			}
		} else {
			this.session.getTCPIP().send(FrameType.RESUME.name());
			this.session.getTCPIP().send(isResume);
		}
	}
	
	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}
}

package mastermind.controllers;

import mastermind.models.Session;

public abstract class ResumeController extends Controller implements AcceptorController {

	public ResumeController(Session session) {
		super(session);
	}

	public abstract void reset(boolean isResume);
	
	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}
}

package mastermind.controllers;

import mastermind.models.Session;

public class ResumeController extends Controller implements AcceptorController {

	public ResumeController(Session session) {
		super(session);
	}

	public void reset() {
		this.session.reset();
	}
	
	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}
}

package mastermind.controllers;

import mastermind.models.Session;

public abstract class StartController extends Controller implements AcceptorController {

	public StartController(Session session) {
		super(session);
	}
	
	public abstract void start();
	
	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}

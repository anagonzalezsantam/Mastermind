package mastermind.controllers;

import mastermind.distributed.dispatchers.DispatcherVisitor;
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
	
	@Override
	public AcceptorController acceptDispatch(DispatcherVisitor dispatcherVisitor) {
		return dispatcherVisitor.visit(this);
	}

}

package mastermind.controllers;

import mastermind.distributed.dispatchers.FrameType;
import mastermind.models.Session;

public class StartController extends Controller implements AcceptorController {

	public StartController(Session session) {
		super(session);
	}
	
	public void start() {
		if(this.session.isStandalone()) {	
			this.session.next();
		} else {
			this.session.getTCPIP().send(FrameType.START.name());
		}
	}
	
	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}

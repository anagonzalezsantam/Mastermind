package mastermind.controllers;

import mastermind.distributed.dispatchers.DispatcherVisitor;

public interface AcceptorController{

	public abstract void accept(ControllerVisitor controllerVisitor);
	public abstract AcceptorController acceptDispatch(DispatcherVisitor dispatcherVisitor);
	
}

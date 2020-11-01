package mastermind.distributed.dispatchers;

import mastermind.controllers.StartController;

public class StartDispatcher extends Dispatcher {

	private StartController startController;
	
	public StartDispatcher(StartController startController) {
		this.startController = startController;
	}

	@Override
	public void dispatch() {
		this.startController.start();
	}

}

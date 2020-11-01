package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;

public class EndDispatcher extends Dispatcher{

	private PlayController playController;
	
	public EndDispatcher(PlayController playController) {
		this.playController = playController;
	}

	public void dispatch() {
		this.playController.end();
	}

}

package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;

public class RedoDispatcher extends Dispatcher {

	private PlayController playController;
	
	public RedoDispatcher(PlayController playController) {
		this.playController = playController;
	}

	public void dispatch() {
		this.playController.redo();
	}

}

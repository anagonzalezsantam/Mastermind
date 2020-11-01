package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;

public class UndoDispatcher extends Dispatcher {

	private PlayController playController;
	
	public UndoDispatcher(PlayController playController) {
		this.playController = playController;
	}

	public void dispatch() {
		this.playController.undo();
	}

}

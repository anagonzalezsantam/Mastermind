package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;

public class UndoableDispatcher extends Dispatcher {

	private PlayController playController;
	
	public UndoableDispatcher(PlayController playController) {
		this.playController = playController;
	}

	public void dispatch() {
		this.tcpip.send(this.playController.isUndoable());
	}

}

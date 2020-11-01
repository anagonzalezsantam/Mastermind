package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;

public class RedoableDispatcher extends Dispatcher {
	
	private PlayController playController;

	public RedoableDispatcher(PlayController playController) {
		this.playController = playController;
	}

	public void dispatch() {
		this.tcpip.send(this.playController.isRedoable());
	}

}

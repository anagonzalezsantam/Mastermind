package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;

public class AttemptDispatcher extends Dispatcher {

	private PlayController playController;
	
	public AttemptDispatcher(PlayController playController) {
		this.playController = playController;
	}

	public void dispatch() {
		this.tcpip.send(this.playController.getAttemptNumber());
	}

}

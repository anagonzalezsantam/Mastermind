package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;

public class AttemptDispatcher extends Dispatcher {

	public AttemptDispatcher(PlayController playController) {
		super(playController);
	}

	public void dispatch() {
		this.tcpip.send(((PlayController)this.acceptorController).getAttemptNumber());
	}

}

package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;

public class WinnerDispatcher extends Dispatcher {

	public WinnerDispatcher(PlayController playController) {
		super(playController);
	}

	public void dispatch() {
		this.tcpip.send(((PlayController)this.acceptorController).isWinner());
	}

}

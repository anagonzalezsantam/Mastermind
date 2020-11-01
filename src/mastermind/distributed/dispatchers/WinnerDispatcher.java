package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;

public class WinnerDispatcher extends Dispatcher {

	private PlayController playController;
	
	public WinnerDispatcher(PlayController playController) {
		this.playController = playController;
	}

	public void dispatch() {
		this.tcpip.send(this.playController.isWinner());
	}

}

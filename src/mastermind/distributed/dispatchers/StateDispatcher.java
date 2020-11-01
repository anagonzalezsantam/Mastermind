package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;

public class StateDispatcher extends Dispatcher {

	private PlayController playController;
	
	public StateDispatcher(PlayController playController) {
		this.playController = playController;
	}

	public void dispatch() {
		this.tcpip.send(this.playController.getValueState().ordinal());
	}

}

package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;

public class StateDispatcher extends Dispatcher {

	public StateDispatcher(PlayController playController) {
		super(playController);
	}

	public void dispatch() {
		this.tcpip.send(((PlayController)this.acceptorController).getValueState().ordinal());
	}

}

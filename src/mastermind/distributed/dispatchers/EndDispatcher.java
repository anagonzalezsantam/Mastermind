package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;

public class EndDispatcher extends Dispatcher{

	public EndDispatcher(PlayController playController) {
		super(playController);
	}

	public void dispatch() {
		((PlayController)this.acceptorController).end();
	}

}

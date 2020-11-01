package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;

public class ResultDispatcher extends Dispatcher {

	public ResultDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		int index = this.tcpip.receiveInt();
		this.tcpip.send(((PlayController) this.acceptorController).getResultLine(index));
	}

}

package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;

public class ResultDispatcher extends Dispatcher {

	private PlayController playController;
	
	public ResultDispatcher(PlayController playController) {
		this.playController = playController;
	}

	@Override
	public void dispatch() {
		int index = this.tcpip.receiveInt();
		this.tcpip.send(this.playController.getResultLine(index));
	}

}

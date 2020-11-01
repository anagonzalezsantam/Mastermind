package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;
import mastermind.models.ProposedCombination;

public class PropositionDispatcher extends Dispatcher{

	private PlayController playController;
	
	public PropositionDispatcher(PlayController playController) {
		this.playController = playController;
	}

	@Override
	public void dispatch() {
		String combination = this.tcpip.receiveLine();
		ProposedCombination proposed = new ProposedCombination(combination);
		this.playController.addProposedCombination(proposed);
	}

}

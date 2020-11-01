package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;
import mastermind.models.ProposedCombination;

public class PropositionDispatcher extends Dispatcher{

	public PropositionDispatcher(PlayController playController) {
		super(playController);
	}

	@Override
	public void dispatch() {
		String combination = this.tcpip.receiveLine();
		ProposedCombination proposed = new ProposedCombination(combination);
		((PlayController)this.acceptorController).addProposedCombination(proposed);
	}

}

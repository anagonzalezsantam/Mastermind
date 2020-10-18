package mastermind.views.console;

import mastermind.controllers.PropositionController;
import mastermind.models.Board;
import mastermind.models.ProposedCombination;
import mastermind.views.Messages;
import mastermind.views.Error;
import utils.Console;

public class PropositionView {
	
	private PropositionController propositionController;
	
	public PropositionView(PropositionController propositionController) {
		this.propositionController = propositionController;
	}
	
	public void interact() {
		ProposedCombination proposed = new ProposedCombination(Console.instance().readString(Messages.PROPOSITION.toString()));
		while(!proposed.hasCorrectLength() || !proposed.hasCorrectSymbols()) {
			if(!proposed.hasCorrectLength()) {
				Error.WRONG_SIZE.writeln();
			} else {
				Error.WRONG_COLOR.writeln();
			}
			proposed = new ProposedCombination(Console.instance().readString(Messages.PROPOSITION.toString()));
		}
		this.propositionController.addProposedCombination(proposed);
	}
}

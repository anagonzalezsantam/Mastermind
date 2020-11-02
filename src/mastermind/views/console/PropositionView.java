package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.models.ProposedCombination;
import mastermind.views.Messages;
import mastermind.views.Error;
import utils.Console;

public class PropositionView {
		
	public void interact(PlayController playController) {
		ProposedCombination proposed = new ProposedCombination(Console.instance().readString(Messages.PROPOSITION.toString()));
		while(!proposed.hasCorrectLength() || !proposed.hasCorrectSymbols()) {
			if(!proposed.hasCorrectLength()) {
				Error.WRONG_SIZE.writeln();
			} else {
				Error.WRONG_COLOR.writeln();
			}
			proposed = new ProposedCombination(Console.instance().readString(Messages.PROPOSITION.toString()));
		}
		playController.addProposedCombination(proposed);
	}
}

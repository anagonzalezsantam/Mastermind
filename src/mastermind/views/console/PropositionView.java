package mastermind.views.console;

import mastermind.controllers.PropositionController;
import mastermind.models.ProposedCombination;
import mastermind.views.Messages;
import mastermind.views.Error;
import utils.Console;

public class PropositionView {
		
	public void interact(PropositionController propositionController) {
		if(propositionController.getAttemptNumber() < 10 && !propositionController.isWinner()) {
			ProposedCombination proposed = new ProposedCombination(Console.instance().readString(Messages.PROPOSITION.toString()));
			while(!proposed.hasCorrectLength() || !proposed.hasCorrectSymbols()) {
				if(!proposed.hasCorrectLength()) {
					Error.WRONG_SIZE.writeln();
				} else {
					Error.WRONG_COLOR.writeln();
				}
				proposed = new ProposedCombination(Console.instance().readString(Messages.PROPOSITION.toString()));
			}
			propositionController.addProposedCombination(proposed);
			propositionController.prev();
			
		} else {
			if(propositionController.isWinner()) {
				Messages.WINNER.writeln();
			} else {
				Messages.LOOSER.writeln();
			}
			propositionController.next();
		}
		
	}
}

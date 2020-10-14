package mastermind.views;

import mastermind.models.Board;
import mastermind.models.ProposedCombination;
import utils.Console;

public class PropositionView {
	
	private Board board;
	
	public PropositionView(Board board) {
		this.board = board;
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
		this.board.addProposedCombination(proposed);
	}
}

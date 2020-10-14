package mastermind.views;

import mastermind.models.Board;
import utils.Console;

public class AttemptView {
	
	private Board board;
	
	public AttemptView(Board board) {
		this.board = board;
	}
	
	public void interact() {
		Messages.LINE.writeln();
		Messages.ATTEMPT.writeln(this.board.getAttemptNumber());
		Messages.SEPARATOR.writeln();
		for(int i=0; i<this.board.getAttemptNumber(); i++) {
			Console.instance().write(this.board.getProposedCombination(i));
			Messages.RESULT.writeln(this.board.getBlacks(i), this.board.getWhites(i));
		}
	}
}

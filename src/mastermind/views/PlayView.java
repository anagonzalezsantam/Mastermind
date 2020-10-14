package mastermind.views;

import mastermind.models.Board;
import utils.Console;

public class PlayView {

	private Board board;
	private AttemptView attemptView;
	private PropositionView propositionView;
	
	public PlayView(Board board) {
		this.board = board;
		this.attemptView = new AttemptView(this.board);
		this.propositionView = new PropositionView(this.board);
	}
	
	public void interact() {
		Console.instance().writeln(Messages.TITTLE.toString());
		this.attemptView.interact();
		do {
			this.propositionView.interact();
			this.attemptView.interact();
			
		} while (this.board.getAttemptNumber() < 10 && !this.board.isWinner());
		
		if(this.board.isWinner()) {
			Messages.WINNER.writeln();
		} else {
			Messages.LOOSER.writeln();
		}
	}
}

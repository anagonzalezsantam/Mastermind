package mastermind.views.console;

import mastermind.controllers.Logic;
import mastermind.views.Messages;
import utils.Console;

public class PlayView {

	private Logic logic;
	private AttemptView attemptView;
	private PropositionView propositionView;
	
	public PlayView(Logic logic) {
		this.logic = logic;
		this.attemptView = new AttemptView(this.logic);
		this.propositionView = new PropositionView(this.logic);
	}
	
	public void interact() {
		Console.instance().writeln(Messages.TITTLE.toString());
		this.attemptView.interact();
		do {
			this.propositionView.interact();
			this.attemptView.interact();
			
		} while (this.logic.getAttemptNumber() < 10 && !this.logic.isWinner());
		
		if(this.logic.isWinner()) {
			Messages.WINNER.writeln();
		} else {
			Messages.LOOSER.writeln();
		}
	}
}

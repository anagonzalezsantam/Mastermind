package mastermind.views.console;

import mastermind.controllers.AttemptController;
import mastermind.controllers.PlayController;
import mastermind.controllers.PropositionController;
import mastermind.models.Board;
import mastermind.views.Messages;
import utils.Console;

public class PlayView {

	private PlayController playController;
	private AttemptView attemptView;
	private PropositionView propositionView;
	
	public PlayView(PlayController playController, AttemptController attemptController, PropositionController propositionController) {
		this.playController = playController;
		this.attemptView = new AttemptView(attemptController);
		this.propositionView = new PropositionView(propositionController);
	}
	
	public void interact() {
		Console.instance().writeln(Messages.TITTLE.toString());
		this.attemptView.interact();
		do {
			this.propositionView.interact();
			this.attemptView.interact();
			
		} while (this.playController.getAttemptNumber() < 10 && !this.playController.isWinner());
		
		if(this.playController.isWinner()) {
			Messages.WINNER.writeln();
		} else {
			Messages.LOOSER.writeln();
		}
	}
}

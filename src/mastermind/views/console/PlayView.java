package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.Messages;

public class PlayView {
	
	private AttemptView attemptView;
	private PropositionView propositionView;
	
	public PlayView() {
		this.attemptView = new AttemptView();
		this.propositionView = new PropositionView();
	}
	
	public void interact(PlayController playController) {
		attemptView.interact(playController);
		do {
			propositionView.interact(playController);
			attemptView.interact(playController);
		} while(playController.getAttemptNumber() < 10 && !playController.isWinner());
		
		if(playController.isWinner()) {
			Messages.WINNER.writeln();
		} else {
			Messages.LOOSER.writeln();
		}
		playController.next();
	}
}

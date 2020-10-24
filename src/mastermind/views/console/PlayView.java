package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.Messages;

public class PlayView {
	
	private PropositionView propositionView;
	private AttemptView attemptView;
	
	public PlayView() {
		this.propositionView = new PropositionView();
		this.attemptView = new AttemptView();
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

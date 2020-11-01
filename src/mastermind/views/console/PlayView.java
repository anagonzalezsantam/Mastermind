package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.Messages;

public class PlayView {

	private AttemptView attemptView;
	
	public PlayView() {
		this.attemptView = new AttemptView();
	}

	public void interact(PlayController playController) {
		this.attemptView.interact(playController);
		do {
			new PlayMenu(playController).execute();
		} while(playController.getAttemptNumber() < 10 && !playController.isWinner());
		
		
		if(playController.isWinner()) {
			Messages.WINNER.writeln();
		} else {
			Messages.LOOSER.writeln();
		}
		playController.end();
	}
}

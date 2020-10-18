package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.Messages;

public class PlayView {
	
	public void interact(PlayController playController) {
		Messages.TITTLE.writeln();
		playController.next();
	}
}

package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.Messages;

public class AttemptView {
	
	public void interact(PlayController playController) {
		Messages.LINE.writeln();
		Messages.ATTEMPT.writeln(playController.getAttemptNumber());
		Messages.SEPARATOR.writeln();
		for(int i=0; i<playController.getAttemptNumber(); i++) {
			Messages.RESULT.writeln(playController.getResultLine(i));
		}
	}
}

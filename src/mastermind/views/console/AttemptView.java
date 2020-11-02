package mastermind.views.console;

import utils.Console;
import mastermind.controllers.PlayController;
import mastermind.views.Messages;

public class AttemptView {
	
	public void interact(PlayController playController) {
		Messages.LINE.writeln();
		Messages.ATTEMPT.writeln(playController.getAttemptNumber());
		Messages.SEPARATOR.writeln();
		for(int i=0; i<playController.getAttemptNumber(); i++) {
			Console.instance().write(playController.getProposedCombination(i));
			Messages.RESULT.writeln(playController.getBlacks(i), playController.getWhites(i));
		}
	}
}

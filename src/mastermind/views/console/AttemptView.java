package mastermind.views.console;

import mastermind.controllers.AttemptController;
import utils.Console;
import mastermind.views.Messages;

public class AttemptView {
	
	public void interact(AttemptController attemptController) {
		Messages.LINE.writeln();
		Messages.ATTEMPT.writeln(attemptController.getAttemptNumber());
		Messages.SEPARATOR.writeln();
		for(int i=0; i<attemptController.getAttemptNumber(); i++) {
			Console.instance().write(attemptController.getProposedCombination(i));
			Messages.RESULT.writeln(attemptController.getBlacks(i), attemptController.getWhites(i));
		}
		attemptController.next();
	}
}

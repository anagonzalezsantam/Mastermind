package mastermind.views.console;

import mastermind.controllers.AttemptController;
import mastermind.models.Board;
import utils.Console;
import mastermind.views.Messages;

public class AttemptView {
	
	private AttemptController attemptController;
	
	public AttemptView(AttemptController attemptController) {
		this.attemptController = attemptController;
	}
	
	public void interact() {
		Messages.LINE.writeln();
		Messages.ATTEMPT.writeln(this.attemptController.getAttemptNumber());
		Messages.SEPARATOR.writeln();
		for(int i=0; i<this.attemptController.getAttemptNumber(); i++) {
			Console.instance().write(this.attemptController.getProposedCombination(i));
			Messages.RESULT.writeln(this.attemptController.getBlacks(i), this.attemptController.getWhites(i));
		}
	}
}

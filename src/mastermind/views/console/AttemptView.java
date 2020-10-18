package mastermind.views.console;

import mastermind.controllers.Logic;
import utils.Console;
import mastermind.views.Messages;

public class AttemptView {
	
	private Logic logic;
	
	public AttemptView(Logic logic) {
		this.logic = logic;
	}
	
	public void interact() {
		Messages.LINE.writeln();
		Messages.ATTEMPT.writeln(this.logic.getAttemptNumber());
		Messages.SEPARATOR.writeln();
		for(int i=0; i<this.logic.getAttemptNumber(); i++) {
			Console.instance().write(this.logic.getProposedCombination(i));
			Messages.RESULT.writeln(this.logic.getBlacks(i), this.logic.getWhites(i));
		}
	}
}

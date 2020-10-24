package mastermind.views.console;

import mastermind.controllers.StartController;
import mastermind.views.Messages;

public class StartView {
	public void interact(StartController startController) {
		Messages.TITTLE.writeln();
		startController.next();
	}
}

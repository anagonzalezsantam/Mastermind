package mastermind.views.console;

import mastermind.controllers.ResumeController;
import mastermind.views.Messages;
import utils.Console;

public class ResumeView {
	
	public void interact(ResumeController resumeController) {
		String answer = Console.instance().readString(Messages.RESUME.toString());
		Messages.LINE.writeln();
		if(answer.toLowerCase().equals("y")) {
			resumeController.reset();
		}else {
			resumeController.next();
		}
	}
}

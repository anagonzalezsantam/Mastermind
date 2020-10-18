package mastermind.views.console;

import mastermind.controllers.ResumeController;
import mastermind.models.Board;
import mastermind.views.Messages;
import utils.Console;

public class ResumeView {
	
	private ResumeController resumeController;
	
	public ResumeView (ResumeController resumeController) {
		this.resumeController = resumeController;
	}
	
	public boolean interact() {
		String answer = Console.instance().readString(Messages.RESUME.toString());
		Messages.LINE.writeln();
		if(answer.toLowerCase().equals("y")) {
			this.resumeController.reset();
			return true;
		}
		return false;
	}
}

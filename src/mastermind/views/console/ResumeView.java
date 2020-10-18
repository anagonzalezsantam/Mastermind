package mastermind.views.console;

import mastermind.controllers.Logic;
import mastermind.views.Messages;
import utils.Console;

public class ResumeView {
	
	private Logic logic;
	
	public ResumeView (Logic logic) {
		this.logic = logic;
	}
	
	public boolean interact() {
		String answer = Console.instance().readString(Messages.RESUME.toString());
		Messages.LINE.writeln();
		if(answer.toLowerCase().equals("y")) {
			this.logic.reset();
			return true;
		}
		return false;
	}
}

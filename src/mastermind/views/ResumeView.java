package mastermind.views;

import utils.Console;

public class ResumeView {
	
	public boolean read() {
		String answer = Console.instance().readString(Messages.RESUME.toString());
		Messages.LINE.writeln();
		return answer.toLowerCase().equals("y");
	}
}

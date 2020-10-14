package mastermind.views;

import mastermind.models.Board;
import utils.Console;

public class ResumeView {
	
	private Board board;
	
	public ResumeView (Board board) {
		this.board = board;
	}
	
	public boolean interact() {
		String answer = Console.instance().readString(Messages.RESUME.toString());
		Messages.LINE.writeln();
		if(answer.toLowerCase().equals("y")) {
			this.board.reset();
			return true;
		}
		return false;
	}
}

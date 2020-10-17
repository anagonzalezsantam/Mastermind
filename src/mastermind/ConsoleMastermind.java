package mastermind;

import mastermind.models.Board;
import mastermind.views.console.View;

public class ConsoleMastermind extends Mastermind {

	@Override
	protected View createView(Board board) {
		return new View(board);
	}
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
}

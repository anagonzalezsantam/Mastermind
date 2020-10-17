package mastermind;

import mastermind.models.Board;
import mastermind.views.console.View;

public class ConsoleMastermind {
	private Board board;
	private View view;

	public ConsoleMastermind() {
		this.board = new Board();
		this.view = new View(this.board);
	}

	private void play() {
		this.view.interact();
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
}

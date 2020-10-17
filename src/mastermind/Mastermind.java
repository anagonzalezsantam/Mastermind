package mastermind;

import mastermind.models.Board;
import mastermind.views.View;

public abstract class Mastermind {
	private Board board;
	private View view;

	public Mastermind() {
		this.board = new Board();
		this.view = this.createView(this.board);
	}

	protected void play() {
		this.view.interact();
	}
	
	protected abstract View createView(Board board);

}

package mastermind;

import mastermind.controllers.Logic;
import mastermind.models.Board;
import mastermind.views.View;

public abstract class Mastermind {
	private Board board;
	private Logic logic;
	private View view;

	public Mastermind() {
		this.board = new Board();
		this.logic = new Logic(this.board);
		this.view = this.createView(this.logic);
	}

	protected void play() {
		this.view.interact();
	}
	
	protected abstract View createView(Logic logic);

}

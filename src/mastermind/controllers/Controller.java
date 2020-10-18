package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.State;

public class Controller {

	protected Board board;
	protected State state;
	
	public Controller(Board board, State state) {
		this.board = board;
		this.state = state;
	}

	public int getAttemptNumber() {
		return this.board.getAttemptNumber();
	}
	
	public void next() {
		this.state.next();
	}
	
	public void prev() {
		this.state.prev();
	}
	
}

package mastermind.controllers;

import mastermind.models.Board;

public class Controller {

	protected Board board;
	
	public Controller(Board board) {
		this.board = board;
	}
	
	public int getAttemptNumber() {
		return this.board.getAttemptNumber();
	}
}

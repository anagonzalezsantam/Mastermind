package mastermind.controllers;

import mastermind.models.Board;

public class ResumeController extends Controller {

	public ResumeController(Board board) {
		super(board);
	}

	public void reset() {
		this.board.reset();
	}
}

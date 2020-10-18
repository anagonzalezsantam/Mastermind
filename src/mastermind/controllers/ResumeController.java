package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.State;

public class ResumeController extends Controller {

	public ResumeController(Board board, State state) {
		super(board, state);
	}

	public void reset() {
		this.board.reset();
		this.state.reset();
	}
}

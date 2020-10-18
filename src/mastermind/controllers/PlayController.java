package mastermind.controllers;

import mastermind.models.Board;

public class PlayController extends Controller {

	public PlayController(Board board) {
		super(board);
	}
	
	public boolean isWinner() {
		return this.board.isWinner();
	}

}

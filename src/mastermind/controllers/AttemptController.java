package mastermind.controllers;

import mastermind.models.Board;

public class AttemptController extends Controller{

	public AttemptController(Board board) {
		super(board);
	}
	
	public String getProposedCombination(int index) {
		return this.board.getProposedCombination(index);
	}
	
	public int getBlacks(int index) {
		return this.board.getBlacks(index);
	}
	
	public int getWhites(int index) {
		return this.board.getWhites(index);
	}

}

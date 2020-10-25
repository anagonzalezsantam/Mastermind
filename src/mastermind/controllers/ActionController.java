package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.ProposedCombination;
import mastermind.models.State;

public class ActionController extends Controller{
	
	public ActionController(Board board, State state) {
		super(board, state);
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
	
	public void addProposedCombination(ProposedCombination proposed) {
		this.board.addProposedCombination(proposed);
	}
	
	public boolean isWinner() {
		return this.board.isWinner();
	}
	
	public int getAttemptNumber() {
		return this.board.getAttemptNumber();
	}

	
}

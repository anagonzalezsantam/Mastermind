package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.ProposedCombination;

public class PropositionController extends Controller {

	public PropositionController(Board board) {
		super(board);
	}
	
	public void addProposedCombination(ProposedCombination proposed) {
		this.board.addProposedCombination(proposed);
	}

}

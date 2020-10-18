package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.ProposedCombination;
import mastermind.models.State;

public class PropositionController extends Controller {

	public PropositionController(Board board, State state) {
		super(board, state);
	}
	
	public void addProposedCombination(ProposedCombination proposed) {
		this.board.addProposedCombination(proposed);
	}
	
	public boolean isWinner() {
		return this.board.isWinner();
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}
}

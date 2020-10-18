package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.State;

public class AttemptController extends Controller{

	public AttemptController(Board board, State state) {
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

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

	

}

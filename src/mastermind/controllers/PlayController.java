package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.State;

public class PlayController extends Controller {

	public PlayController(Board board, State state) {
		super(board, state);
	}
	
	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}

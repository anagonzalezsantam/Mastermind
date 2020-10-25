package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.State;

public class RedoController extends Controller {

	public RedoController(Board board, State state) {
		super(board, state);
	}
	
	public void redo() {
		System.out.println("Haciendo redo");
	}

	public boolean isRedoable() {
		return true;
	}

}

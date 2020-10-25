package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.State;

public class UndoController extends Controller {

	public UndoController(Board board, State state) {
		super(board, state);
	}
	
	public void undo() {
		System.out.println("Haciendo undo");
	}
	
	public boolean isUndoable() {
		return true;
	}

}

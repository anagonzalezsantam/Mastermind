package mastermind.controllers;

import mastermind.models.Session;

public class UndoController extends Controller {

	public UndoController(Session session) {
		super(session);
	}
	
	public void undo() {
		this.session.undo();
	}
	
	public boolean isUndoable() {
		return this.session.isUndoable();
	}

}

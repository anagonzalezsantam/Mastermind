package mastermind.controllers.implementation;

import mastermind.controllers.ActionController;
import mastermind.controllers.PlayController;
import mastermind.controllers.RedoController;
import mastermind.controllers.UndoController;
import mastermind.models.ProposedCombination;
import mastermind.models.Session;

public class PlayControllerImplementation extends PlayController {
	
	private ActionController actionController;
	private UndoController undoController;
	private RedoController redoController;
	
	public PlayControllerImplementation(Session session) {
		super(session);
		this.actionController = new ActionController(session);
		this.undoController = new UndoController(session);
		this.redoController = new RedoController(session);
	}
	
	public String getResultLine(int index) {
		return this.actionController.getProposedCombination(index) + "-" + this.actionController.getBlacks(index) + "-" + this.actionController.getWhites(index);			
	}
		
	public void addProposedCombination(ProposedCombination proposed) {
		this.actionController.addProposedCombination(proposed);			
	}
	
	public boolean isWinner() {
		return this.actionController.isWinner();			
	}
	
	public int getAttemptNumber() {
		return this.actionController.getAttemptNumber();			
	}
	
	public void undo() {
		this.undoController.undo();
	}
	
	public boolean isUndoable() {
		return this.undoController.isUndoable();
	}
	
	public void redo() {
		this.redoController.redo();
	}
	
	public boolean isRedoable() {
		return this.redoController.isRedoable();
	}
	
	public void end() {
		this.session.next();
	}
}

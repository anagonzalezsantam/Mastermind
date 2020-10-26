package mastermind.controllers;

import mastermind.models.ProposedCombination;
import mastermind.models.Session;

public class PlayController extends Controller implements AcceptorController{

	private ActionController actionController;
	private UndoController undoController;
	private RedoController redoController;
	
	public PlayController(Session session) {
		super(session);
		this.actionController = new ActionController(session);
		this.undoController = new UndoController(session);
		this.redoController = new RedoController(session);
	}
	
	public String getProposedCombination(int index) {
		return this.actionController.getProposedCombination(index);
	}
	
	public int getBlacks(int index) {
		return this.actionController.getBlacks(index);
	}
	
	public int getWhites(int index) {
		return this.actionController.getWhites(index);
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
	
	
	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}

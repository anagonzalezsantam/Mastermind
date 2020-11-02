package mastermind.controllers;

import mastermind.models.ProposedCombination;
import mastermind.models.Session;

public abstract class PlayController extends Controller implements AcceptorController{

	public PlayController(Session session) {
		super(session);
	}
	
	public abstract String getResultLine(int index);
		
	public abstract void addProposedCombination(ProposedCombination proposed);
	
	public abstract boolean isWinner();
	
	public abstract int getAttemptNumber();
	
	public abstract void undo();
	
	public abstract boolean isUndoable();
	
	public abstract void redo();
	
	public abstract boolean isRedoable();
	
	public abstract void end();
	
	
	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}

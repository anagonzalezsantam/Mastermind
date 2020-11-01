package mastermind.controllers;

import mastermind.distributed.dispatchers.FrameType;
import mastermind.models.ProposedCombination;
import mastermind.models.Session;

public class PlayController extends Controller implements AcceptorController{

	private ActionController actionController;
	private UndoController undoController;
	private RedoController redoController;
	
	public PlayController(Session session) {
		super(session);
		if(this.session.isStandalone()) {
			this.actionController = new ActionController(session);
			this.undoController = new UndoController(session);
			this.redoController = new RedoController(session);			
		}
	}
	
	public String getResultLine(int index) {
		if(this.session.isStandalone()) {
			return this.actionController.getProposedCombination(index) + "-" + this.actionController.getBlacks(index) + "-" + this.actionController.getWhites(index);			
		} else {
			this.session.getTCPIP().send(FrameType.RESULT.name());
			this.session.getTCPIP().send(index);
			return this.session.getTCPIP().receiveLine();
		}
	}
		
	public void addProposedCombination(ProposedCombination proposed) {
		if(this.session.isStandalone()) {
			this.actionController.addProposedCombination(proposed);			
		} else {
			this.session.getTCPIP().send(FrameType.PROPOSITION.name());
			this.session.getTCPIP().send(proposed.toString());
		}
	}
	
	public boolean isWinner() {
		if(this.session.isStandalone()) {
			return this.actionController.isWinner();			
		} else {
			this.session.getTCPIP().send(FrameType.IS_WINNER.name());
			return this.session.getTCPIP().receiveBoolean();
		}
	}
	
	public int getAttemptNumber() {
		if(this.session.isStandalone()) {
			return this.actionController.getAttemptNumber();			
		} else {
			this.session.getTCPIP().send(FrameType.ATTEMPT.name());
			return this.session.getTCPIP().receiveInt();
		}
	}
	
	public void undo() {
		if(this.session.isStandalone()) {			
			this.undoController.undo();
		}else {
			this.session.getTCPIP().send(FrameType.UNDO.name());
		}
	}
	
	public boolean isUndoable() {
		if(this.session.isStandalone()) {			
			return this.undoController.isUndoable();
		}else {
			this.session.getTCPIP().send(FrameType.IS_UNDOABLE.name());
			return this.session.getTCPIP().receiveBoolean();
		}
	}
	
	public void redo() {
		if(this.session.isStandalone()) {			
			this.redoController.redo();
		}else {
			this.session.getTCPIP().send(FrameType.REDO.name());
		}
	}
	
	public boolean isRedoable() {
		if(this.session.isStandalone()) {			
			return this.redoController.isRedoable();
		}else {
			this.session.getTCPIP().send(FrameType.IS_REDOABLE.name());
			return this.session.getTCPIP().receiveBoolean();
		}
	}
	
	public void end() {
		if(this.session.isStandalone()) {	
			this.session.next();
		} else {
			this.session.getTCPIP().send(FrameType.END.name());
		}
	}
	
	
	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

}

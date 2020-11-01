package mastermind.distributed;

import mastermind.controllers.PlayController;
import mastermind.distributed.dispatchers.FrameType;
import mastermind.models.ProposedCombination;
import mastermind.models.Session;
import utils.TCPIP;

public class PlayControllerProxy extends PlayController {

	private TCPIP tcpip;
	
	public PlayControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}
	
	public String getResultLine(int index) {
		this.tcpip.send(FrameType.RESULT.name());
		this.tcpip.send(index);
		return this.tcpip.receiveLine();
	}
		
	public void addProposedCombination(ProposedCombination proposed) {
		this.tcpip.send(FrameType.PROPOSITION.name());
		this.tcpip.send(proposed.toString());
	}
	
	public boolean isWinner() {
		this.tcpip.send(FrameType.IS_WINNER.name());
		return this.tcpip.receiveBoolean();
	}
	
	public int getAttemptNumber() {
		this.tcpip.send(FrameType.ATTEMPT.name());
		return this.tcpip.receiveInt();
	}
	
	public void undo() {
		this.tcpip.send(FrameType.UNDO.name());
	}
	
	public boolean isUndoable() {
		this.tcpip.send(FrameType.IS_UNDOABLE.name());
		return this.tcpip.receiveBoolean();
	}
	
	public void redo() {
		this.tcpip.send(FrameType.REDO.name());
	}
	
	public boolean isRedoable() {
		this.tcpip.send(FrameType.IS_REDOABLE.name());
		return this.tcpip.receiveBoolean();
	}
	
	public void end() {
		this.tcpip.send(FrameType.END.name());
	}
	
}

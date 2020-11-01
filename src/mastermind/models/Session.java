package mastermind.models;

import mastermind.distributed.dispatchers.FrameType;
import utils.TCPIP;

public class Session {

	private Board board;
	private State state;
	private GameRegistry registry;
	private TCPIP tcpip;
	
	public Session(TCPIP tcpip) {
		this.board = new Board();
		this.state = new State();
		this.registry = new GameRegistry(this.board);
		this.tcpip = tcpip;
	}
	
	public int getAttemptNumber() {
		return this.board.getAttemptNumber();
	}
	
	public void addProposedCombination(ProposedCombination proposed) {
		this.board.addProposedCombination(proposed);
		this.registry.register();
	}
	
	
	public boolean isWinner() {
		return this.board.isWinner();
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
	
	public void reset() {
		this.state.reset();
		this.board.reset();
		this.registry.reset();
	}
	
	public void next() {
		this.state.next();
	}
	
	public StateValues getStateValue() {
		if(this.tcpip == null) {			
			return this.state.getStateValue();
		} else {
			this.tcpip.send(FrameType.STATE.name());
			return StateValues.values()[this.tcpip.receiveInt()];
		}
	}
	
	public void undo() {
		this.registry.undo();
	}

	  public boolean isUndoable() {
	    return this.registry.isUndoable();
	  }

	  public void redo() {
	    this.registry.redo();
	  }

	  public boolean isRedoable() {
	    return this.registry.isRedoable();
	  }
	  
	  public TCPIP getTCPIP() {
		  return this.tcpip;
	  }
	  
	  public boolean isStandalone() {
		  return this.tcpip == null;
	  }
	
}

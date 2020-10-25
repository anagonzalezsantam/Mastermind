package mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import mastermind.models.Board;
import mastermind.models.State;
import mastermind.models.StateValues;

public class Logic {

	private Board board;
	private State state;
	private Map<StateValues, AcceptorController> controllers;
	
	public Logic() {
		this.board = new Board();
		this.state = new State();
		this.controllers = new HashMap<StateValues, AcceptorController>();
		this.controllers.put(StateValues.INITIAL, new StartController(this.board, this.state));
		this.controllers.put(StateValues.GAME, new PlayController(this.board, this.state));
		this.controllers.put(StateValues.FINISH, new ResumeController(this.board, this.state));
		this.controllers.put(StateValues.EXIT, null);
	}
	
	public AcceptorController getController() {
		return this.controllers.get(this.state.getStateValue());
	}
}

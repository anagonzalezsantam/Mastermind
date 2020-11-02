package mastermind;

import java.util.HashMap;
import java.util.Map;

import mastermind.controllers.Controller;
import mastermind.controllers.PlayController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.models.Board;
import mastermind.models.State;
import mastermind.models.StateValues;

public class Mastermind {
	
	private Map<StateValues, Controller> controllers;
	private Board board;
	private State state;

	public Mastermind() {
		this.board = new Board();
		this.state = new State();
		this.controllers = new HashMap<StateValues, Controller>();
		this.controllers.put(StateValues.INITIAL, new StartController(this.board, this.state));
		this.controllers.put(StateValues.GAME, new PlayController(this.board, this.state));
		this.controllers.put(StateValues.FINISH, new ResumeController(this.board, this.state));
		this.controllers.put(StateValues.EXIT, null);
	}

	protected void play() {
		Controller controller;
		do {
			controller = this.controllers.get(state.getStateValue());
			if(controller != null) {
				controller.control();			
			}
		} while(controller != null);
	}
	
	public static void main(String[] args) {
		new Mastermind().play();
	}
	
}

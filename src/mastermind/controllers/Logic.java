package mastermind.controllers;

import java.util.HashMap;
import java.util.Map;
import mastermind.models.Session;
import mastermind.models.StateValues;

public class Logic {

	private Session session;
	private Map<StateValues, AcceptorController> controllers;
	
	public Logic() {
		this.session = new Session();
		this.controllers = new HashMap<StateValues, AcceptorController>();
		this.controllers.put(StateValues.INITIAL, new StartController(this.session));
		this.controllers.put(StateValues.GAME, new PlayController(this.session));
		this.controllers.put(StateValues.FINISH, new ResumeController(this.session));
		this.controllers.put(StateValues.EXIT, null);
	}
	
	public AcceptorController getController() {
		return this.controllers.get(this.session.getStateValue());
	}
}

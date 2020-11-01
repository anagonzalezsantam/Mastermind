package mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import mastermind.models.Session;
import mastermind.models.StateValues;

public class Logic {

	protected Session session;
	protected Map<StateValues, AcceptorController> controllers;
	
	public Logic() {
		this.controllers = new HashMap<StateValues, AcceptorController>();
	}
	
	public AcceptorController getController() {
		return this.controllers.get(this.session.getStateValue());
	}
	
}

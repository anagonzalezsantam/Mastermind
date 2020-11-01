package mastermind.controllers;

import mastermind.models.Session;
import mastermind.models.StateValues;

public class Controller {

	protected Session session;
	
	public Controller(Session session) {
		this.session = session;
	}
	
	public void next() {
		this.session.next();
	}
	
	public StateValues getValueState() {
		return this.session.getStateValue();
	}
	
}

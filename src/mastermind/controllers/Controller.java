package mastermind.controllers;

import mastermind.models.Session;

public class Controller {

	protected Session session;
	
	public Controller(Session session) {
		this.session = session;
	}
	
	public void next() {
		this.session.next();
	}
	
}

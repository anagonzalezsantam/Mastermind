package mastermind.controllers.implementation;

import mastermind.controllers.Logic;
import mastermind.models.SessionImplementation;
import mastermind.models.StateValues;

public class LogicImplementation extends Logic {
	
	protected StartControllerImplementation startControllerImplementation;
	protected PlayControllerImplementation playControllerImplementation;
	protected ResumeControllerImplementation resumeControllerImplementation;

	public LogicImplementation() {
		this.session = new SessionImplementation();
		this.startControllerImplementation = new StartControllerImplementation(this.session);
		this.playControllerImplementation = new PlayControllerImplementation(this.session);
		this.resumeControllerImplementation = new ResumeControllerImplementation(this.session);
		this.controllers.put(StateValues.INITIAL, this.startControllerImplementation);
		this.controllers.put(StateValues.GAME, this.playControllerImplementation);
		this.controllers.put(StateValues.FINISH, this.resumeControllerImplementation);
		this.controllers.put(StateValues.EXIT, null);
	}
}

package mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import mastermind.distributed.dispatchers.FrameType;
import mastermind.models.Session;
import mastermind.models.StateValues;
import utils.TCPIP;

public class Logic {

	private Session session;
	private Map<StateValues, AcceptorController> controllers;
	protected StartController startController;
	protected PlayController playController;
	protected ResumeController resumeController;
	private TCPIP tcpip;
	
	public Logic(boolean isStandalone) {
		if(isStandalone) {
			this.tcpip = null;
		} else {
			this.tcpip = TCPIP.createClientSocket();
		}
		this.session = new Session(this.tcpip);
		this.startController = new StartController(this.session);
		this.playController  = new PlayController(this.session);
		this.resumeController = new ResumeController(this.session);
		this.controllers = new HashMap<StateValues, AcceptorController>();
		this.controllers.put(StateValues.INITIAL, this.startController);
		this.controllers.put(StateValues.GAME, this.playController);
		this.controllers.put(StateValues.FINISH, this.resumeController);
		this.controllers.put(StateValues.EXIT, null);
	}
	
	public AcceptorController getController() {
		return this.controllers.get(this.session.getStateValue());
	}
	
	public void close() {
		this.tcpip.send(FrameType.CLOSE.name());
		this.tcpip.close();
	}
}

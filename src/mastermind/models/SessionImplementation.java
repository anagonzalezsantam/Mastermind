package mastermind.models;

public class SessionImplementation extends Session {
	
	public SessionImplementation() {
		super();
	}
	
	public StateValues getStateValue() {
		return this.state.getStateValue();
	}
}

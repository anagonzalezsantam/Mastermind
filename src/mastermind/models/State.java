package mastermind.models;

public class State {

	private StateValues stateValue;
	
	public State() {
		this.reset();
	}
	
	public void reset() {
		this.stateValue = StateValues.INITIAL;
	}
	
	public void next() {
		this.stateValue = StateValues.values()[this.stateValue.ordinal() + 1];	
	}
		
	public StateValues getStateValue() {
		return this.stateValue;
	}
}

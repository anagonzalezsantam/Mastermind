package mastermind;

import mastermind.controllers.Logic;
import mastermind.views.View;

public abstract class Mastermind {
	private Logic logic;
	private View view;

	public Mastermind() {
		this.logic = new Logic();
		this.view = this.createView(this.logic);
	}

	protected void play() {
		this.view.interact();
	}
	
	protected abstract View createView(Logic logic);

}

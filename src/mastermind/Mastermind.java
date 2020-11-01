package mastermind;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.Logic;
import mastermind.views.View;

public abstract class Mastermind {
	private Logic logic;
	private View view;

	public Mastermind() {
		this.logic = new Logic(this.isStandalone());
		this.view = this.createView();
	}

	protected void play() {
		AcceptorController controller;
		do {
			controller = this.logic.getController();
			if(controller != null) {
				this.view.interact(controller);				
			}
		} while(controller != null);

		if(!this.isStandalone()) {
			this.logic.close();
		}
	}
	
	protected abstract boolean isStandalone();
	
	protected abstract View createView();

}

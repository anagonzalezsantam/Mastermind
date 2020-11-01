package mastermind;

import mastermind.views.console.View;

public class MastermindStandalone extends Mastermind {
	
	protected boolean isStandalone() {
		return true;
	}

	protected View createView() {
		return new View();
	}
	
	public static void main(String[] args) {
		new MastermindStandalone().play();
	}
}

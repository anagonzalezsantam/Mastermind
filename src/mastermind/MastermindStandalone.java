package mastermind;

import mastermind.controllers.Logic;
import mastermind.controllers.implementation.LogicImplementation;
import mastermind.views.console.View;

public class MastermindStandalone extends Mastermind {
	
	protected Logic createLogic() {
		return new LogicImplementation();
	}

	protected View createView() {
		return new View();
	}
	
	public static void main(String[] args) {
		new MastermindStandalone().play();
	}
}

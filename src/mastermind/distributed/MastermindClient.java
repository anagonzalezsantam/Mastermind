package mastermind.distributed;

import mastermind.Mastermind;
import mastermind.views.console.View;

public class MastermindClient extends Mastermind{

	protected boolean isStandalone() {
		return false;
	}

	protected View createView() {
		return new View();
	}
	
	public static void main(String[] args) {
		new MastermindClient().play();
	}

}

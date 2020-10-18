package mastermind;

import mastermind.controllers.Logic;
import mastermind.views.console.View;

public class ConsoleMastermind extends Mastermind {

	@Override
	protected View createView(Logic logic) {
		return new View(logic);
	}
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
}

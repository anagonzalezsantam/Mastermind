package mastermind;

import mastermind.views.console.View;

public class ConsoleMastermind extends Mastermind {

	@Override
	protected View createView() {
		return new View();
	}
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
}

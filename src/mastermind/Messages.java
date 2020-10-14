package mastermind;

import utils.Console;

enum Messages {
	TITTLE("--- MASTERMIND ---"),
	ATTEMPT(" attempt(s):"), 
	SEPARATOR("XXXX"), 
	PROPOSITION("Propose a combination: "), 
	WINNER("You've won!!! ;-)"),
	LOOSER("You've lost!!! :-("),
	RESUME("RESUME? (y/n):"),
	LINE("");

	private String message;

	private Messages() {
		
	}
	
	private Messages(String message) {
		this.message = message;
	}

	void write() {
		Console.instance().write(this.message);
	}

	void writeln() {
		Console.instance().writeln(this.message);
	}

	@Override
	public String toString() {
		return this.message;
	}

}

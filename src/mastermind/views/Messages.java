package mastermind.views;

import utils.Console;

enum Messages {
	TITTLE("--- MASTERMIND ---"),
	ATTEMPT("#number attempt(s):"), 
	SEPARATOR("XXXX"), 
	PROPOSITION("Propose a combination: "), 
	RESULT(" ---> #num_b black and #num_w white"), 
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

	void writeln(int num) {
		Console.instance().writeln(this.message.replaceAll("#number", String.valueOf(num)));
	}
	
	void writeln(int numB, int numW) {
		Console.instance().writeln(this.message.replaceAll("#num_b", String.valueOf(numB)).replaceAll("#num_w", String.valueOf(numW)));
	}

	@Override
	public String toString() {
		return this.message;
	}

}


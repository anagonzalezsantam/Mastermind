package mastermind.views;

import utils.Console;

public enum Messages {
	TITTLE("--- MASTERMIND ---"),
	ATTEMPT("#number attempt(s):"), 
	SEPARATOR("XXXX"), 
	PROPOSITION("Propose a combination: "), 
	RESULT("#proposition ---> #num_b black and #num_w white"), 
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

	public void write() {
		Console.instance().write(this.message);
	}

	public void writeln() {
		Console.instance().writeln(this.message);
	}

	public void writeln(int num) {
		Console.instance().writeln(this.message.replaceAll("#number", String.valueOf(num)));
	}
	
	public void writeln(String resultString) {
		String[] parts = resultString.split("-");
		String proposition = parts[0];
		String numB = parts[1];
		String numW = parts[2];
		Console.instance().writeln(this.message.replaceAll("#proposition", proposition).replaceAll("#num_b", String.valueOf(numB)).replaceAll("#num_w", String.valueOf(numW)));
	}

	@Override
	public String toString() {
		return this.message;
	}

}


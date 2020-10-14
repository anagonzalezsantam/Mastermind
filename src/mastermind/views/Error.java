package mastermind.views;

import utils.Console;

enum Error {
	WRONG_SIZE("Wrong proposed combination length"),
	WRONG_COLOR("Wrong color, they must be: rybgpo");

	private String error;

	private Error() {
		
	}
	
	private Error(String error) {
		this.error = error;
	}

	void write() {
		Console.instance().write(this.error);
	}

	void writeln() {
		Console.instance().writeln(this.error);
	}

	@Override
	public String toString() {
		return this.error;
	}

}

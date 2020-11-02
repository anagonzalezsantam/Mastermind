package mastermind.views;

import utils.Console;

public class PropositionView {
	
	public String readProposition() {
		return Console.instance().readString(Messages.PROPOSITION.toString());
	}
		
	public void writeLengthError(boolean correctLength) {
		if(!correctLength) {
			Error.WRONG_SIZE.writeln();
		}
	}
	
	public void writeColorError(boolean correctSymbol) {
		if(!correctSymbol) {
			Error.WRONG_COLOR.writeln();
		}
	}
	
}

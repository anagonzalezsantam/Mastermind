package mastermind.views;

public class ResultView {

	public void writeResult(boolean isWinner) {
		if(isWinner) {
			Messages.WINNER.writeln();
		} else {
			Messages.LOOSER.writeln();
		}
	}
}

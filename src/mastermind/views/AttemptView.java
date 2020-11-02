package mastermind.views;

public class AttemptView {
	
	public void writeNumber(int attemptNumber) {
		Messages.LINE.writeln();
		Messages.ATTEMPT.writeln(attemptNumber);
		Messages.SEPARATOR.writeln();
	}
	
	public void writeResult(String result) {
		Messages.RESULT.writeln(result);
	}
}

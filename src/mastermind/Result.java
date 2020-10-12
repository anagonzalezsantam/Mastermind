package mastermind;

public class Result {
	private int whites;
	private int blacks;
	
	public Result() {
		this.whites = 0;
		this.blacks = 0;
	}
	
	public void sumWhites() {
		this.whites++;
	}
	
	public void sumBlacks() {
		this.blacks++;
	}
	
	public boolean isWinner() {
		return this.blacks == 4;
	}
	
	@Override
	public String toString() {
		return this.blacks + " black and " + this.whites + " whites";
	}
}

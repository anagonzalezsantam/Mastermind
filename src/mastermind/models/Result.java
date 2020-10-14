package mastermind.models;

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
	
	public int getBlacks() {
		return this.blacks;
	}
	
	public int getWhites() {
		return this.whites;
	}
}

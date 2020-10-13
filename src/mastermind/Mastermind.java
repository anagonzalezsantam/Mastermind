package mastermind;

import utils.Console;

public class Mastermind {

	private Board board;
	private boolean resumeGame;
	

	private void play() {
		do {
			board = new Board();
			resumeGame = false;
			this.playGame();			
		} while (this.resumeGame);
	}
	
	private void playGame() {
		Messages.TITTLE.writeln();
		this.board.writeResults();
		
		do {	
			ProposedCombination proposed = new ProposedCombination(Console.instance().readString(Messages.PROPOSITION.toString()));
			while(!proposed.hasCorrectLength() || !proposed.hasCorrectSymbols()) {
				if(!proposed.hasCorrectLength()) {
					Error.WRONG_SIZE.writeln();
				} else {
					Error.WRONG_COLOR.writeln();
				}
				proposed = new ProposedCombination(Console.instance().readString(Messages.PROPOSITION.toString()));
			}
			this.board.addProposedCombination(proposed);				
			Messages.LINE.writeln();
			this.board.writeResults();
			
		} while(this.board.getAttemptNumber() < 10 && !this.board.isWinner());
		
		if(this.board.isWinner()) {
			Messages.WINNER.writeln();
		} else {
			Messages.LOSSER.writeln();
		}
		String answer = Console.instance().readString(Messages.RESUME.toString());
		Messages.LINE.writeln();
		if(answer.toLowerCase().equals("y")) {
			resumeGame = true;
		}
	}
	
	public static void main(String[] args) {
		new Mastermind().play();
	}
}

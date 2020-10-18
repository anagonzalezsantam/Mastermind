package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.ProposedCombination;

public class Logic {

	private Board board;
	private AttemptController attemptController;
	private PlayController playController;
	private PropositionController propositionController;
	private ResumeController resumeControler;
	
	public Logic() {
		this.board = new Board();
		this.attemptController = new AttemptController(this.board);
		this.playController = new PlayController(this.board); 
		this.propositionController = new PropositionController(this.board);
		this.resumeControler = new ResumeController(this.board);
	}
	
	public int getAttemptNumber() {
		return this.playController.getAttemptNumber();
	}
	
	public boolean isWinner() {
		return this.playController.isWinner();
	}
	
	public String getProposedCombination(int index) {
		return this.attemptController.getProposedCombination(index);
	}
	
	public int getBlacks(int index) {
		return this.attemptController.getBlacks(index);
	}
	
	public int getWhites(int index) {
		return this.attemptController.getWhites(index);
	}
	
	public void addProposedCombination(ProposedCombination proposed) {
		this.propositionController.addProposedCombination(proposed);
	}
	
	public void reset() {
		this.resumeControler.reset();
	}
}

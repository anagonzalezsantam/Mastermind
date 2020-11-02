package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.ProposedCombination;
import mastermind.models.State;
import mastermind.views.AttemptView;
import mastermind.views.PropositionView;
import mastermind.views.ResultView;

public class PlayController extends Controller {

	private AttemptView attemptView;
	private PropositionView propositionView;
	private ResultView resultView;
	
	public PlayController(Board board, State state) {
		super(board, state);
		this.attemptView = new AttemptView();
		this.propositionView = new PropositionView();
		this.resultView = new ResultView();
	}
	
	public void writeResult() {
		this.attemptView.writeNumber(this.board.getAttemptNumber());
		for(int i = 0; i < this.board.getAttemptNumber(); i++) {
			String result = this.board.getProposedCombination(i) + "-" + this.board.getBlacks(i) + "-" + this.board.getWhites(i);
			this.attemptView.writeResult(result);
		}
	}
	
	public void readProposition() {
		ProposedCombination proposed = new ProposedCombination(this.propositionView.readProposition());
		while(!proposed.hasCorrectLength() || !proposed.hasCorrectSymbols()) {
			this.propositionView.writeLengthError(proposed.hasCorrectLength());
			this.propositionView.writeColorError(proposed.hasCorrectSymbols());
			proposed = new ProposedCombination(this.propositionView.readProposition());
		}
		this.board.addProposedCombination(proposed);	
	}
	
	@Override
	public void control() {
		this.writeResult();
		do {
			this.readProposition();
			this.writeResult();
		} while(this.board.getAttemptNumber() < 10 && !this.board.isWinner());
		
		this.resultView.writeResult(this.board.isWinner());
		this.next();
		
	}

}

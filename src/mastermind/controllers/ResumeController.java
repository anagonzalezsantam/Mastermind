package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.State;
import mastermind.views.ResumeView;

public class ResumeController extends Controller {

	private ResumeView resumeView;
	
	public ResumeController(Board board, State state) {
		super(board, state);
		this.resumeView = new ResumeView();
	}

	public void reset() {
		this.board.reset();
		this.state.reset();
	}

	@Override
	public void control() {
		boolean answer = this.resumeView.read();
		if(answer) {
			this.reset();
		}else {
			this.next();
		}
		
	}
	
}

package mastermind.views;

import mastermind.models.Board;
import utils.Console;

public class View {
	private Board board;
	private PlayView playView;
	private ResumeView resumeView;
	
	public View(Board board) {
		this.board = board;
		this.playView = new PlayView(this.board);
		this.resumeView = new ResumeView(this.board);
	}

	public void interact() {
		do {
			this.playView.interact();
		} while (this.resumeView.interact());
	}
	
}

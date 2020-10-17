package mastermind.views;

import mastermind.models.Board;
import utils.Console;

public class View {
	private PlayView playView;
	private ResumeView resumeView;
	
	public View(Board board) {
		this.playView = new PlayView(board);
		this.resumeView = new ResumeView(board);
	}

	public void interact() {
		do {
			this.playView.interact();
		} while (this.resumeView.interact());
	}
	
}

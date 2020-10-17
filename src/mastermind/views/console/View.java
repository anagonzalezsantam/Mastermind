package mastermind.views.console;

import mastermind.models.Board;

public class View extends mastermind.views.View{
	private PlayView playView;
	private ResumeView resumeView;
	
	public View(Board board) {
		this.playView = new PlayView(board);
		this.resumeView = new ResumeView(board);
	}

	@Override
	protected void play() {
		this.playView.interact();
	}

	@Override
	protected boolean isResumed() {
		return this.resumeView.interact();
	}
	
}

package mastermind.views.console;

import mastermind.controllers.Logic;

public class View extends mastermind.views.View{
	private PlayView playView;
	private ResumeView resumeView;
	
	public View(Logic logic) {
		this.playView = new PlayView(logic);
		this.resumeView = new ResumeView(logic);
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

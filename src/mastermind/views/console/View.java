package mastermind.views.console;

import mastermind.controllers.AttemptController;
import mastermind.controllers.PlayController;
import mastermind.controllers.PropositionController;
import mastermind.controllers.ResumeController;
import mastermind.models.Board;

public class View extends mastermind.views.View{
	private PlayView playView;
	private ResumeView resumeView;
	
	public View(AttemptController attemptController, PlayController playController, PropositionController propositionController, ResumeController resumeController) {
		this.playView = new PlayView(playController, attemptController, propositionController);
		this.resumeView = new ResumeView(resumeController);
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

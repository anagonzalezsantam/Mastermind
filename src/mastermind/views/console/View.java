package mastermind.views.console;

import mastermind.controllers.Controller;
import mastermind.controllers.PlayController;
import mastermind.controllers.PropositionController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.AttemptController;

public class View extends mastermind.views.View{
	private PlayView playView;
	private ResumeView resumeView;
	private AttemptView attemptView;
	private PropositionView propositionView;
	
	public View() {
		this.playView = new PlayView();
		this.resumeView = new ResumeView();
		this.propositionView = new PropositionView();
		this.attemptView = new AttemptView();
	}

	@Override
	public void interact(Controller controller) {
		if(controller instanceof  PlayController) {
			this.playView.interact((PlayController) controller);
		} else if(controller instanceof ResumeController) {
			this.resumeView.interact((ResumeController) controller);
		} else if(controller instanceof PropositionController) {
			this.propositionView.interact((PropositionController) controller);
		} else {
			this.attemptView.interact((AttemptController) controller);
		}
	}
	
}

package mastermind.views.console;

import mastermind.controllers.Controller;
import mastermind.controllers.ControllerVisitor;
import mastermind.controllers.PlayController;
import mastermind.controllers.PropositionController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.AttemptController;

public class View extends mastermind.views.View implements ControllerVisitor{
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
		controller.accept(this);
	}

	@Override
	public void visit(AttemptController attemptController) {
		this.attemptView.interact(attemptController);
	}

	@Override
	public void visit(PropositionController propositionController) {
		this.propositionView.interact(propositionController);
	}

	@Override
	public void visit(PlayController playController) {
		this.playView.interact(playController);
	}

	@Override
	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
	}
	
}

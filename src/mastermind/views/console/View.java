package mastermind.views.console;

import mastermind.controllers.Controller;
import mastermind.controllers.ControllerVisitor;
import mastermind.controllers.PlayController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;

public class View extends mastermind.views.View implements ControllerVisitor{
	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;
	
	public View() {
		this.startView = new StartView();
		this.playView = new PlayView();
		this.resumeView = new ResumeView();
	}

	@Override
	public void interact(Controller controller) {
		controller.accept(this);
	}

	@Override
	public void visit(StartController startController) {
		this.startView.interact(startController);
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

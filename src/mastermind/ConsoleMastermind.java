package mastermind;

import mastermind.controllers.AttemptController;
import mastermind.controllers.PlayController;
import mastermind.controllers.PropositionController;
import mastermind.controllers.ResumeController;
import mastermind.views.console.View;

public class ConsoleMastermind extends Mastermind {

	@Override
	protected View createView(AttemptController attemptController, PlayController playController, PropositionController propositionController, ResumeController resumeController) {
		return new View(attemptController, playController, propositionController, resumeController);
	}
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
}

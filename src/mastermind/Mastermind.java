package mastermind;

import mastermind.controllers.AttemptController;
import mastermind.controllers.PlayController;
import mastermind.controllers.PropositionController;
import mastermind.controllers.ResumeController;
import mastermind.models.Board;
import mastermind.views.View;

public abstract class Mastermind {
	private Board board;
	private AttemptController attemptController;
	private PlayController playController;
	private PropositionController propositionController;
	private ResumeController resumeController;
	private View view;

	public Mastermind() {
		this.board = new Board();
		this.attemptController = new AttemptController(this.board);
		this.playController = new PlayController(this.board);
		this.propositionController = new PropositionController(this.board);
		this.resumeController = new ResumeController(this.board);
		this.view = this.createView(this.attemptController,this.playController,this.propositionController,this.resumeController);
	}

	protected void play() {
		this.view.interact();
	}
	
	protected abstract View createView(AttemptController attemptController, PlayController playController, PropositionController propositionController, ResumeController resumeController);

}

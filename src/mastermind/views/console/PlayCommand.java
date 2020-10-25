package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.Messages;

public class PlayCommand extends Command {

	private PropositionView propositionView;
	private AttemptView attemptView;
	
	public PlayCommand(PlayController playController) {
		super(Messages.PROPOSE_OPTION.toString(), playController);
		this.propositionView = new PropositionView();
		this.attemptView = new AttemptView();
	}

	@Override
	protected void execute() {
		this.propositionView.interact(this.playController);
		this.attemptView.interact(this.playController);
	}

	@Override
	protected boolean isActive() {
		return true;
	}
	
}

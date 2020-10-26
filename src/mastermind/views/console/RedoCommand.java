package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.Messages;

public class RedoCommand extends Command{

	private AttemptView attemptView; 
	
	public RedoCommand(PlayController playController) {
		super(Messages.REDO_OPTION.toString(), playController);
		this.attemptView = new AttemptView();
	}

	@Override
	protected void execute() {
		this.playController.redo();
		this.attemptView.interact(playController);
	}

	@Override
	protected boolean isActive() {
		return this.playController.isRedoable();
	}
}

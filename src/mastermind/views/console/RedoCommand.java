package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.Messages;

public class RedoCommand extends Command{

	public RedoCommand(PlayController playController) {
		super(Messages.REDO_OPTION.toString(), playController);
	}

	@Override
	protected void execute() {
		this.playController.redo();
	}

	@Override
	protected boolean isActive() {
		return this.playController.isRedoable();
	}
}

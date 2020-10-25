package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.Messages;

public class UndoCommand extends Command {

	public UndoCommand(PlayController playController) {
		super(Messages.UNDO_OPTION.toString(), playController);
	}
	
	@Override
	protected void execute() {
		this.playController.undo();
	}

	@Override
	protected boolean isActive() {
		return this.playController.isUndoable();
	}

}

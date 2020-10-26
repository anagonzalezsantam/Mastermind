package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.Messages;

public class UndoCommand extends Command {
	
	private AttemptView attemptView;

	public UndoCommand(PlayController playController) {
		super(Messages.UNDO_OPTION.toString(), playController);
		this.attemptView = new AttemptView();
	}
	
	@Override
	protected void execute() {
		this.playController.undo();
		this.attemptView.interact(playController);
	}

	@Override
	protected boolean isActive() {
		return this.playController.isUndoable();
	}

}

package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.Messages;

public class UndoCommand extends Command {

	public UndoCommand(PlayController playController) {
		super(Messages.UNDO_OPTION.toString(), playController);
	}
	
	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isActive() {
		// TODO Auto-generated method stub
		return true;
	}

}

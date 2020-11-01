package mastermind.distributed;

import mastermind.controllers.Logic;
import mastermind.distributed.dispatchers.AttemptDispatcher;
import mastermind.distributed.dispatchers.DispatcherPrototype;
import mastermind.distributed.dispatchers.EndDispatcher;
import mastermind.distributed.dispatchers.FrameType;
import mastermind.distributed.dispatchers.PropositionDispatcher;
import mastermind.distributed.dispatchers.RedoDispatcher;
import mastermind.distributed.dispatchers.RedoableDispatcher;
import mastermind.distributed.dispatchers.ResultDispatcher;
import mastermind.distributed.dispatchers.ResumeDispatcher;
import mastermind.distributed.dispatchers.StartDispatcher;
import mastermind.distributed.dispatchers.StateDispatcher;
import mastermind.distributed.dispatchers.UndoDispatcher;
import mastermind.distributed.dispatchers.UndoableDispatcher;
import mastermind.distributed.dispatchers.WinnerDispatcher;

public class LogicServer extends Logic {

	public LogicServer(boolean isStandalone) {
		super(isStandalone);
	}

	public DispatcherPrototype createDispatcherPrototype() {
		DispatcherPrototype dispatcherPrototype = new DispatcherPrototype();
		dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startController));
		dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.RESULT, new ResultDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.PROPOSITION, new PropositionDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.IS_WINNER, new WinnerDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.ATTEMPT, new AttemptDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.IS_UNDOABLE, new UndoableDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.IS_REDOABLE, new RedoableDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.END, new EndDispatcher(this.playController));
		dispatcherPrototype.add(FrameType.RESUME, new ResumeDispatcher(this.resumeController));
		dispatcherPrototype.add(FrameType.CLOSE, null);
		return dispatcherPrototype;
	}
}

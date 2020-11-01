package mastermind.distributed;

import mastermind.controllers.implementation.LogicImplementation;
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

public class LogicServerImplementation extends LogicImplementation {

	public DispatcherPrototype createDispatcherPrototype() {
		DispatcherPrototype dispatcherPrototype = new DispatcherPrototype();
		dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));
		dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.RESULT, new ResultDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.PROPOSITION, new PropositionDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.IS_WINNER, new WinnerDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.ATTEMPT, new AttemptDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.IS_UNDOABLE, new UndoableDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.IS_REDOABLE, new RedoableDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.END, new EndDispatcher(this.playControllerImplementation));
		dispatcherPrototype.add(FrameType.RESUME, new ResumeDispatcher(this.resumeControllerImplementation));
		dispatcherPrototype.add(FrameType.CLOSE, null);
		return dispatcherPrototype;
	}
}

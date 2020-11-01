package mastermind.distributed.dispatchers;

import mastermind.controllers.PlayController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;

public interface DispatcherVisitor {
	public abstract StartController visit(StartController startController);
	public abstract PlayController visit(PlayController playController);
	public abstract ResumeController visit(ResumeController resumeController);
}

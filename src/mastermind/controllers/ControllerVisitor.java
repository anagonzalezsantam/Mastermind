package mastermind.controllers;

public interface ControllerVisitor {
	
	public abstract void visit(StartController startController);
	public abstract void visit(PlayController playController);
	public abstract void visit(ResumeController resumeController);
}

package mastermind.controllers;

public interface ControllerVisitor {
	
	public abstract void visit(AttemptController attemptController);
	public abstract void visit(PropositionController propositionController);
	public abstract void visit(PlayController playController);
	public abstract void visit(ResumeController resumeController);
}

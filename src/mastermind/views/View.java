package mastermind.views;

public abstract class View {

	public void interact() {
		do {
			this.play();
		} while (this.isResumed());
	}
	
	protected abstract void play();
	protected abstract boolean isResumed();
	
}

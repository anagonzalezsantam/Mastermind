package mastermind.controllers;

import mastermind.models.ProposedCombination;
import mastermind.models.Session;

public class ActionController extends Controller{
	
	public ActionController(Session session) {
		super(session);
	}

	public String getProposedCombination(int index) {
		return this.session.getProposedCombination(index);
	}
	
	public int getBlacks(int index) {
		return this.session.getBlacks(index);
	}
	
	public int getWhites(int index) {
		return this.session.getWhites(index);
	}
	
	public void addProposedCombination(ProposedCombination proposed) {
		this.session.addProposedCombination(proposed);
	}
	
	public boolean isWinner() {
		return this.session.isWinner();
	}
	
	public int getAttemptNumber() {
		return this.session.getAttemptNumber();
	}

	
}

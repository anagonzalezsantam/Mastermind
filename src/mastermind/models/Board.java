package mastermind.models;

import java.util.ArrayList;

public class Board {
	private SecretCombination secret;
	private ArrayList<ProposedCombination> proposedList;
	private ArrayList<Result> resultList;
	
	public Board() {
		secret = new SecretCombination();
		proposedList = new ArrayList<>();
		resultList = new ArrayList<>();
	}
	
	public int getAttemptNumber() {
		return proposedList.size();
	}
	
	public void addProposedCombination(ProposedCombination proposed) {
		this.proposedList.add(proposed);
		Result result = this.secret.compareCombinations(proposed);
		resultList.add(result);
	}
	
	
	public boolean isWinner() {
		if(resultList.size() > 0) {
			return resultList.get(resultList.size() - 1).isWinner();			
		} 
		return false;
	}
	
	public String getProposedCombination(int index) {
		ProposedCombination proposed = this.proposedList.get(index);
		return proposed.toString();
	}
	
	public int getBlacks(int index) {
		Result result = this.resultList.get(index);
		return result.getBlacks();
	}
	
	public int getWhites(int index) {
		Result result = this.resultList.get(index);
		return result.getWhites();
	}
	
	public void reset() {
		secret = new SecretCombination();
		proposedList = new ArrayList<>();
		resultList = new ArrayList<>();
	}
	
	public GameMemento createMemento() {
		return new GameMemento(this.proposedList, this.resultList);
	}
	
	public void setMemento(GameMemento gameMemento) {
		this.proposedList = gameMemento.getProposedList();
		this.resultList = gameMemento.getResultList();
	}
}

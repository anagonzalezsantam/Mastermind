package mastermind.models;

import java.util.ArrayList;

public class GameMemento {

	private ArrayList<ProposedCombination> proposedList;
	private ArrayList<Result> resultList;
	
	public GameMemento(ArrayList<ProposedCombination> proposedList, ArrayList<Result> resultList) {
		this.proposedList = new ArrayList<ProposedCombination>(proposedList);
		this.resultList = new ArrayList<Result>(resultList);
	}

	public ArrayList<ProposedCombination> getProposedList() {
		return new ArrayList<ProposedCombination>(this.proposedList);
	}

	public ArrayList<Result> getResultList() {
		return new ArrayList<Result>(this.resultList);
	}

}

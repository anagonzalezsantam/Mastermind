package mastermind;

import java.util.ArrayList;

import utils.Console;

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
		compareCombinations(proposed);
	}
	
	private void compareCombinations(ProposedCombination proposed) {
		Result result = new Result();
		ArrayList<String> secret_copy = (ArrayList<String>) secret.getList().clone();
		for(int i = 0; i < 4; i++) {
			if(proposed.getList().get(i).equals(secret.getList().get(i))) {
				result.sumBlacks();
				secret_copy.remove(proposed.getList().get(i));
			} 
		}
		int secret_copy_size = secret_copy.size();
		for (int i = 0; i < secret_copy_size; i++) {
			if(secret_copy.contains(proposed.getList().get(i))) {
				result.sumWhites();
				secret_copy.remove(proposed.getList().get(i));
			}
		}
		resultList.add(result);
	}
	
	private String getPropositionResult(int index) {
		String string = this.proposedList.get(index).toString() + " ---> " + this.resultList.get(index).toString();
		return string;
	}
	
	
	public void writeResults() {
		Console.instance().write(this.getAttemptNumber());
		Messages.ATTEMPT.writeln();
		Messages.SEPARATOR.writeln();
		for(int i=0; i<this.getAttemptNumber(); i++) {
			Console.instance().writeln(getPropositionResult(i));
		}
	}
	
	public boolean isWinner() {
		if(resultList.size() > 0) {
			return resultList.get(resultList.size() - 1).isWinner();			
		} 
		return false;
	}
}

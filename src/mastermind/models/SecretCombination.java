package mastermind.models;

import java.util.ArrayList;
import java.util.Random;

public class SecretCombination extends Combination{
	
	public SecretCombination() {
		super(generateSecretCombination());
	}
	
	private static ArrayList<String> generateSecretCombination() {
		ArrayList<String> color_list = Combination.getColorList();
		ArrayList<String> colors = new ArrayList<>();
		Random random = new Random();
		for(int i=0; i<MAX_SIZE; i++) {
			String s = color_list.get(random.nextInt(color_list.size()));
			colors.add(s);
		}
		return colors;
	}
	
	public Result compareCombinations(ProposedCombination proposed) {
		Result result = new Result();
		ArrayList<String> secret_copy = new ArrayList<String>(this.getList());
		ArrayList<String> proposed_copy = new ArrayList<String>(proposed.getList());
		for(int i = 0; i < MAX_SIZE; i++) {
			if(proposed.getList().get(i).equals(this.getList().get(i))) {
				result.sumBlacks();
				secret_copy.remove(this.getList().get(i));
				proposed_copy.remove(proposed.getList().get(i));
			} 
		}
		for (int i = 0; i < secret_copy.size(); i++) {
			if(proposed_copy.contains(secret_copy.get(i))) {
				result.sumWhites();
			}
		}
		return result;
	}
	
}

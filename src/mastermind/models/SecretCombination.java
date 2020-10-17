package mastermind.models;

import java.util.ArrayList;
import java.util.Random;

public class SecretCombination extends Combination{

	private static final int MAX_SIZE = 4;
	
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
		ArrayList<String> secret_copy = (ArrayList<String>) this.getList().clone();
		for(int i = 0; i < MAX_SIZE; i++) {
			if(proposed.getList().get(i).equals(this.getList().get(i))) {
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
		return result;
	}

}

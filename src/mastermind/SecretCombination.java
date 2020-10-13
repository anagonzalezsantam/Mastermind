package mastermind;

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
		
	
}

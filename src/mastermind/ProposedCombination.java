package mastermind;

import java.util.ArrayList;
import java.util.Arrays;

public class ProposedCombination extends Combination{
	
	public ProposedCombination(String string) {
		super(getListFromString(string));
	}
	
	private static ArrayList<String> getListFromString(String string) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(string.split("")));
		return list;
	}
	
	public boolean hasCorrectLength() {
		return (this.colors.size() == 4);
	}
	
	public boolean hasCorrectSymbols() {
		for(String color : this.colors) {
			if(!Combination.getColorList().contains(color)) {
				return false;
			}
		}
		return true;
	}
	
}

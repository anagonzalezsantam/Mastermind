package mastermind.models;

import java.util.ArrayList;

public class Combination {
	protected ArrayList<String> colors;
	protected static final int MAX_SIZE = 4;
	private static final String BLUE = "b";
	private static final String RED = "r";
	private static final String GREEN = "g";
	private static final String YELLOW = "y";
	private static final String ORANGE = "o";
	private static final String PURPLE = "p";
	
	public Combination(ArrayList<String> colors) {
		this.colors = colors;
	}
	
	protected static ArrayList<String> getColorList() {
		ArrayList<String> list = new ArrayList<>();
		list.add(BLUE);
		list.add(RED);
		list.add(GREEN);
		list.add(YELLOW);
		list.add(ORANGE);
		list.add(PURPLE);
		return list;
	}
	
	public ArrayList<String> getList() {
		return this.colors;
	}
	
	@Override
	public String toString() {
		String string = "";
		for(String color : this.colors) {
			string += color;
		}
		return string;
	}
}

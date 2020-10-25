package utils;

import java.util.ArrayList;

public class Menu {
	private final String CHOOSE_MESSAGE = "----- Choose one option -----";
	private ArrayList<Command> commandList;
	
	public Menu() {
		this.commandList = new ArrayList<>();
	}
	
	public void addCommand(Command command) {
		this.commandList.add(command);
	}
	
	public void execute() {
		ArrayList<Command> commands = new ArrayList<>();
		for(int i = 0; i < this.commandList.size(); i++) {
			if(this.commandList.get(i).isActive()) {
				commands.add(this.commandList.get(i));
			}
		}
		
		Console console = Console.instance();
		int option;
	    do {
	      console.writeln();
	      console.writeln(this.CHOOSE_MESSAGE);
	      for (int i = 0; i < commands.size(); i++) {
	        console.writeln((i + 1) + ") " + commands.get(i).getTitle());
	      }
	      option = console.readInt() - 1;
	    } while (option < 0 || option >= commands.size());
	    
	    commands.get(option).execute();
	}
}

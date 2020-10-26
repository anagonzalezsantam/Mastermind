package mastermind.models;

import java.util.ArrayList;

public class GameRegistry {

	private Board board;
	private ArrayList<GameMemento> mementos;
	private int current;
	
	public GameRegistry(Board board) {
		this.board = board;
		this.current = 0;
		this.mementos = new ArrayList<>();
		this.mementos.add(this.board.createMemento());
	}

	public void undo() {
		this.current--;
		this.board.setMemento(this.mementos.get(this.current));
	}

	public boolean isUndoable() {
		return this.current > 0;
	}

	public void redo() {
		this.current++;
		this.board.setMemento(this.mementos.get(this.current));
	}

	public boolean isRedoable() {
		return this.current < this.mementos.size() - 1;
	}
	
	public void register() {
		this.current++;
		for(int i = current; i < mementos.size(); i++) {
			this.mementos.remove(i);
		}
		this.mementos.add(this.board.createMemento());
	}

}

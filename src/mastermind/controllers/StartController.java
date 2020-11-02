package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.State;
import mastermind.views.StartView;

public class StartController extends Controller {

	private StartView startView;
	
	public StartController(Board board, State state) {
		super(board, state);
		this.startView = new StartView();
	}

	@Override
	public void control() {
		this.startView.write();
		this.next();
	}

}

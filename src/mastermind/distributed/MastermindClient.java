package mastermind.distributed;

import mastermind.Mastermind;
import mastermind.controllers.Logic;
import mastermind.views.console.View;

public class MastermindClient extends Mastermind{

	private LogicProxy logicProxy;
	
	protected View createView() {
		return new View();
	}

	protected Logic createLogic() {
		this.logicProxy = new LogicProxy();
		return this.logicProxy;
	}
	
	public void play() {
		super.play();
		this.logicProxy.close();
	}
	
	public static void main(String[] args) {
		new MastermindClient().play();
	}

}

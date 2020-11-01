package mastermind.distributed;

import mastermind.distributed.dispatchers.DispatcherPrototype;

public class MastermindServer {

	private DispatcherPrototype dispatcherPrototype;
	private LogicServer logicServer;
	
	public MastermindServer() {
		this.logicServer = new LogicServer(true);
		this.dispatcherPrototype = this.logicServer.createDispatcherPrototype();
	}
	
	public void serve() {
		this.dispatcherPrototype.serve();
	}
	
	public static void main(String[] args) {
		new MastermindServer().serve();
	}
}

package mastermind.distributed;

import mastermind.distributed.dispatchers.DispatcherPrototype;

public class MastermindServer {

	private DispatcherPrototype dispatcherPrototype;
	private LogicServerImplementation logicServer;
	
	public MastermindServer() {
		this.logicServer = new LogicServerImplementation();
		this.dispatcherPrototype = this.logicServer.createDispatcherPrototype();
	}
	
	public void serve() {
		this.dispatcherPrototype.serve();
	}
	
	public static void main(String[] args) {
		new MastermindServer().serve();
	}
}

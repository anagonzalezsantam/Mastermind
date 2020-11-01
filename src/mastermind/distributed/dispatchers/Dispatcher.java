package mastermind.distributed.dispatchers;

import utils.TCPIP;

public abstract class Dispatcher {
	
	protected TCPIP tcpip;

	public abstract void dispatch();
	
	public void associate(TCPIP tcpip) {
		this.tcpip = tcpip;
	}
	
}

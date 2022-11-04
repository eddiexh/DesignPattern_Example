package State;

import State.ConcreteState.TCPClosed;

public class TCPConnection {
	//Context
	private TCPState state;
	
	public TCPConnection() {
		state = new TCPClosed();
	}
	
	public void setState(TCPState state) {
		this.state = state;
	}
	
	public void open() {
		state.open(this);
	}
	
	public void close() {
		state.close(this);
	}
	
	public void acknowledge() {
		state.acknowledge(this);
	}
}

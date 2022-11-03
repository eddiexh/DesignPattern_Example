package State;

public class TCPListen extends TCPState {

	@Override
	public void open(TCPConnection tcp) {
		System.out.println("TCP is already open and wait for connection.");
	}

	@Override
	public void close(TCPConnection tcp) {
		System.out.println("TCP closing...");
		tcp.setState(new TCPClosed());
	}

	@Override
	public void acknowledge(TCPConnection tcp) {
		System.out.println("TCP connection success.");
		tcp.setState(new TCPEstablished());
	}

}

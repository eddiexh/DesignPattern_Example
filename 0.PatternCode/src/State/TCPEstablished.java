package State;

public class TCPEstablished extends TCPState {

	@Override
	public void close(TCPConnection tcp) {
		System.out.println("TCP closing...");
		tcp.setState(new TCPClosed());
	}

	@Override
	public void acknowledge(TCPConnection tcp) {
		System.out.println("TCP already connection.");
	}

}
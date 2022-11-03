package State;

public class TCPClosed extends TCPState {

	@Override
	public void open(TCPConnection tcp) {
		System.out.println("The tcp connection open.");
		tcp.setState(new TCPListen());
	}
}

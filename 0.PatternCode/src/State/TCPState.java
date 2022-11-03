package State;

public abstract class TCPState {
	public void open(TCPConnection tcp) {}
	public void close(TCPConnection tcp) {}
	public void acknowledge(TCPConnection tcp) {}
}

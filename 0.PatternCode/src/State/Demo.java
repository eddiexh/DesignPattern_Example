package State;

public class Demo {
	public static void main(String[] args) {
		TCPConnection tcp = new TCPConnection();
		tcp.open();
		tcp.open();
		tcp.close();
		tcp.open();
		tcp.acknowledge();
		tcp.close();
	}
}

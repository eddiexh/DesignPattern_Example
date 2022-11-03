package Proxy;

public class ProxyDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("OO Teamwork Class Diagram");
		
		image.display();
		System.out.println();
		
		image.display();
	}

}

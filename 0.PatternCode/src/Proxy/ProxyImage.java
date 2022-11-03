package Proxy;

public class ProxyImage implements Image {

	private String fileName = null;
	private Image real = null;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void display() {
		if(real == null) {
			real = new RealImage(this.fileName);
		}
		
		real.display();
	}
}

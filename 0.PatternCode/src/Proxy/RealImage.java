package Proxy;

public class RealImage implements Image {
	//RealSubject
	private String fileName = null;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loading();
	}
	
	@Override
	public void display() {
		System.out.println("Display Image¡G" + this.fileName);
	}
	
	public void loading() {
		System.out.println("Loading file¡G" + this.fileName);
	}

}

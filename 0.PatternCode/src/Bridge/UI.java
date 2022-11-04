package Bridge;

public abstract class UI {
	//Abstraction
	protected UIImp os = null;
	
	public void setOS(UIImp os) {
		this.os = os;
	}
	
	public abstract void start();
}

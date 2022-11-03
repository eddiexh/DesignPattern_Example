package Bridge;

public abstract class UI {
	protected UIImp os = null;
	
	public void setOS(UIImp os) {
		this.os = os;
	}
	
	public abstract void start();
}

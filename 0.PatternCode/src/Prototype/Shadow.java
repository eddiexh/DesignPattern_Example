package Prototype;

public class Shadow implements Cloneable {
	public int shadowHeight;
	
	public Shadow() {
		this.shadowHeight = 1;
	}
	
	public int getHeight() {
		return this.shadowHeight;
	}
	
	public void setHeight(int shadowHeight) {
		this.shadowHeight = shadowHeight;
	}

	public Object clone() {
		Object clone = null;

		try {
			clone = super.clone();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

		return clone;
	}
}

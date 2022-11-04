package Prototype.ConcretePrototype;

public class DeepSquare implements Cloneable {
	
	public int height;
	public Shadow shadow;
	
	public DeepSquare(int height) {
		this.height = height;
		this.shadow = new Shadow();
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Shadow getShadow() {
		return this.shadow;
	}
	
	public Object clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
			((DeepSquare) clone).shadow = (Shadow) this.shadow.clone();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return clone;
	}
}

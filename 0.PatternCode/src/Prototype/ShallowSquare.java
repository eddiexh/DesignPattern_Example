package Prototype;

public class ShallowSquare implements Cloneable {
	
	public int height;
	public Color color;
	
	public ShallowSquare(int height) {
		this.height = height;
		this.color = new Color();
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Color getColor() {
		return color;
	}
	
	public Object clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		return clone;
	}
}

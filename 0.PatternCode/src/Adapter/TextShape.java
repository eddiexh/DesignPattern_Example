package Adapter;

public class TextShape extends Shape {
	//Adapter
	private TextView adaptee;
	
	public TextShape(TextView tv) {
		adaptee = tv;
	}
	
	@Override
	public void draw() {
		adaptee.getExtent();
	}
}

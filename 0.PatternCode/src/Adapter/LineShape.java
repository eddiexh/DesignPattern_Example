package Adapter;

public class LineShape extends Shape {
	//Adapter
	@Override
	public void draw() {
		System.out.println("draw LineShape");
	}
}

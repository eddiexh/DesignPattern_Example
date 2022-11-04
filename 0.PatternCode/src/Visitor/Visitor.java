package Visitor;

public interface Visitor {
	//Visitor
	public void go(Airplan tool);
	public void go(Bicycle tool);
	public void go(Car tool);
}

package Visitor;

public class Car extends TrafficTool {
	//ConcreteElement
	private int speed;
	
	public Car(int speed) {
		this.speed = speed;
	}
	
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.go(this);
	}
	
	public int getSpeed() {
		return this.speed;
	}

}

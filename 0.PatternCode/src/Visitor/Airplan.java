package Visitor;

public class Airplan extends TrafficTool {

	private int speed;
	
	public Airplan(int speed) {
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

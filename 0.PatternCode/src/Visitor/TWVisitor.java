package Visitor;

public class TWVisitor implements Visitor {
	//ConcreteVisitor
	@Override
	public void go(Airplan tool) {
		// TODO Auto-generated method stub
		System.out.println("Airplan in Taiwam can drive speed " + tool.getSpeed());
	}

	@Override
	public void go(Bicycle tool) {
		// TODO Auto-generated method stub
		System.out.println("Bicycle in Taiwam can drive speed " + tool.getSpeed());
	}

	@Override
	public void go(Car tool) {
		// TODO Auto-generated method stub
		System.out.println("Car in Taiwam can drive speed " + tool.getSpeed());
	}

}

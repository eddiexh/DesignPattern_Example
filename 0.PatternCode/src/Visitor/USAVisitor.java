package Visitor;

public class USAVisitor implements Visitor {
	//ConcreteVisitor
	@Override
	public void go(Airplan tool) {
		// TODO Auto-generated method stub
		System.out.println("Airplan in USA can drive speed " + tool.getSpeed() * 2);
	}

	@Override
	public void go(Bicycle tool) {
		// TODO Auto-generated method stub
		System.out.println("Bicycle in USA can drive speed " + tool.getSpeed() * 2);
	}

	@Override
	public void go(Car tool) {
		// TODO Auto-generated method stub
		System.out.println("Car in USA can drive speed " + tool.getSpeed() * 2);
	}
	
}

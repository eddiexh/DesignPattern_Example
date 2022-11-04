package Visitor;

public class VisitorDemo {
	//Client
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplan air = new Airplan(200);
		Car car = new Car(110);
		Bicycle bic = new Bicycle(60);
		
		TWVisitor tw = new TWVisitor();
		USAVisitor usa = new USAVisitor();
		
		air.accept(tw);
		car.accept(tw);
		bic.accept(tw);
		System.out.println("");
		air.accept(usa);
		car.accept(usa);
		bic.accept(usa);
	}

}

package Observer;

public class DemoMain {

	public static void main(String[] args) {
		Observer o1 = new ConcreteObserver();
		Observer o2 = new ConcreteObserver();
		Subject s = new ConcreteSubject();
		
		s.attach(o1);
		s.attach(o2);
		s.setState("State1");
		s.printState();
		o1.printState();
		o2.printState();
		
		System.out.print("\n============================\n"
				+ "===Change Subject's state==="
				+ "\n============================\n\n");
		
		s.setState("State2");
		s.printState();
		o1.printState();
		o2.printState();
	}

}

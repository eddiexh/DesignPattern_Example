package Observer;

public class ConcreteObserver implements Observer {

	private String observerState;
	
	@Override
	public void update(Subject s) {
		this.observerState = s.getState();
	}

	@Override
	public void printState() {
		System.out.println("This observer's state is " + this.observerState);
	}

	/* Other operations... */
}

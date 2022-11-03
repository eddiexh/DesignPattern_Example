package Observer;

public class ConcreteSubject extends Subject {
	private String subjectState;
	
	@Override
	public String getState() {
		return this.subjectState;
	}
	
	@Override
	public void setState(String subjectState) {
		this.subjectState = subjectState;
		super.notifing();
	}
	
	@Override
	public void printState() {
		System.out.println("This Subject's state is " + this.subjectState);
	}
}

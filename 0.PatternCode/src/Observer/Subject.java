package Observer;

import java.util.ArrayList;

public abstract class Subject {
	protected ArrayList<Observer> observers = new ArrayList<>();
	
	public void attach(Observer o) {
		observers.add(o);
	}
	
	public void detach(Observer o) {
		observers.remove(o);
	}
	
	public void notifing() {
		for(Observer o : observers) {
			o.update(this);
		}
	}
	
	public abstract void printState();
	
	abstract String getState();
	abstract void setState(String subjectState);
	
}

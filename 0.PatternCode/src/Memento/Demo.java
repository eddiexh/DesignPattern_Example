package Memento;

public class Demo {
	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();

		originator.set("State1");
		originator.printState();
		originator.set("State2");
		originator.printState();
		caretaker.addMemento(originator.saveToMemento());
		originator.set("State3");
		originator.printState();
		caretaker.addMemento(originator.saveToMemento());
		originator.set("State4");
		originator.printState();

		originator.restoreFromMemento(caretaker.getMemento(1));
		originator.printState();
		
		Memento error = caretaker.getMemento(1);
		try {
			String state = error.getState("is he");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}

}

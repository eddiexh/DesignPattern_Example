package Memento_Memento;

import java.util.ArrayList;

class Caretaker {
    private ArrayList<Memento> savedStates = new ArrayList<Memento>();
    public void addMemento(Memento m) {
        savedStates.add(m);
    }
    public Memento getMemento(int index) {
        return savedStates.get(index);
    }
}

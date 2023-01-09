package Observer_Archive.ConcreteSubject;
import Observer_Archive.Observer;
import Observer_Archive.Subject;

import java.util.*;

public class Database implements Subject {
    //ConcreteSubject
    private Vector observers;
    private String operation;
    private String record;

    public Database() {
        observers = new Vector();
    }

    @Override
    public void registerObserver(Object o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Object o) {
        observers.remove(o);
    }

    public void editRecord(String operation, String record) {
        this.operation = operation;
        this.record = record;
        notifyObserver();
    }
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(operation, record);
        }
    }
}

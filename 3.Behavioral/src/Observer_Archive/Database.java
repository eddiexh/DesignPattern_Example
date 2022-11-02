package Observer_Archive;
import java.util.*;

public class Database implements Subject{
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
        for (int loopIndex = 0; loopIndex < observers.size(); loopIndex++) {
            Observer observer = (Observer)observers.get(loopIndex);
            observer.update(operation, record);
        }
    }
}

package Observer_Archive.ConcreteObserver;

import Observer_Archive.Observer;

public class Archiver implements Observer {
    //ConcreteObserver
    public Archiver() {

    }

    public void update(String operation, String record) {
        System.out.println("This archiver says a " + operation + " operation was performed on " + record);
    }
}

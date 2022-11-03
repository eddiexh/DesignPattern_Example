package Observer_Archive.ConcreteObserver;

import Observer_Archive.Observer;

public class Client implements Observer {
    //ConcreteObserver
    public Client() {

    }

    public void update(String operation, String record) {
        System.out.println("This client says a " + operation + " operation was performed on " + record);
    }
}

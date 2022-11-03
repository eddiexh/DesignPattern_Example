package Observer_Archive.ConcreteObserver;

import Observer_Archive.Observer;

public class Boss implements Observer {
    //ConcreteObserver
    public Boss() {

    }
    public void update(String operation, String record) {
        System.out.println("This Boss says a " + operation + " operation was performed on " + record);
    }
}

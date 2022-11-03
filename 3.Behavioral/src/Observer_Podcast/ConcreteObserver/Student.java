package Observer_Podcast.ConcreteObserver;

import Observer_Podcast.Observer;
import Observer_Podcast.Subject;

public class Student implements Observer {
    //ConcreteObserver
    Subject subject;

    public Student(Subject subject){
        this.subject = subject;
    }
    @Override
    public void update() {
        System.out.println("聽了" + subject.getName());
    }

}

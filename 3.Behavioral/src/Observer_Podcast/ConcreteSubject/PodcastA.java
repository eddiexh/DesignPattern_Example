package Observer_Podcast.ConcreteSubject;

import Observer_Podcast.Observer;
import Observer_Podcast.Subject;
import java.util.ArrayList;
import java.util.List;

public class PodcastA implements Subject {
    //ConcreteSubject
    List<Observer> list = new ArrayList<>();

    //節目名稱
    public String name = "英文廣播";

    @Override
    public void add(Observer o) {
        list.add(o);
    }

    @Override
    public void remove(Observer o) {
        list.remove(o);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void notifyObservers() {
        for (Observer o: list) {
            o.update();
        }
    }
}

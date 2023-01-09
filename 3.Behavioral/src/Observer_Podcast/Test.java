package Observer_Podcast;

import Observer_Podcast.ConcreteObserver.Student;
import Observer_Podcast.ConcreteSubject.PodcastA;

public class Test {
    public static void main(String[] args) {
        Subject podcast = new PodcastA(); //Concrete Subject
        Observer student = new Student(podcast); //Concrete Observer
        podcast.add(student);

        //預設節目是英文廣播
        podcast.notifyObservers();

        //節目變為今年流行歌
        ((PodcastA) podcast).name = "今年流行歌";

        podcast.notifyObservers();
    }
}

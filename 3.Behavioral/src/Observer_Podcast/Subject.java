package Observer_Podcast;

public interface Subject {
    //Subject
    public void add(Observer o);
    public void remove(Observer o);
    public void notifyObservers();

    String getName();
}



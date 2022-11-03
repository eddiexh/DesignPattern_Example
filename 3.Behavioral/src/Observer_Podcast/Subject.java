package Observer_Podcast;

public interface Subject {
    //Subject
    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifyObservers();

    String getName();
}



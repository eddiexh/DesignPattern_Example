package Observer_Archive;

public interface Subject {
    public void registerObserver(Object o);
    public void removeObserver(Object o);
    public void notifyObserver();
}

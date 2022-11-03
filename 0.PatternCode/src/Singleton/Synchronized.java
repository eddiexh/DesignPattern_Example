package Singleton;

public class Synchronized {
    private static Synchronized instance;

    private Synchronized() {}

    synchronized public static Synchronized getInstance() {
        if(instance == null) {
            instance = new Synchronized();
        }
        return instance;
    }
    /* can do other something */
}

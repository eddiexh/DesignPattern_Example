package Singleton;

public class LazyDoubleSingleton {
    private static LazyDoubleSingleton instance;
    private LazyDoubleSingleton() {}
    public static LazyDoubleSingleton getInstance() {
        if (instance == null) {
            synchronized(LazyDoubleSingleton.class) {
                if (instance == null) instance = new LazyDoubleSingleton();
            }
        }
        return instance;
    }
}

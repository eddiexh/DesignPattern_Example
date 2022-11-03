package Singleton;

public class EagerSingleton {
	private static EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
	/* can do other something */
//	EagerSingletion e = EagerSingletion.getInstance();
}

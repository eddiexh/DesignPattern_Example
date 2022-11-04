package Decorator;

public abstract class Seasoning implements Meal {
	//Decorator
	protected Meal ml;
	
	public Seasoning(Meal ml) {
		this.ml = ml;
	}
}

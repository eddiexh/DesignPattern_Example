package Decorator;

public abstract class Seasoning implements Meal {
	protected Meal ml;
	
	public Seasoning(Meal ml) {
		this.ml = ml;
	}
}

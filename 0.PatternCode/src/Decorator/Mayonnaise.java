package Decorator;

public class Mayonnaise extends Seasoning {

	public Mayonnaise(Meal ml) {
		super(ml);
	}

	@Override
	public String eat() {
		return "¬ü¤D´þ" + ml.eat();
	}
	
	@Override
	public int price() {
		return 15 + ml.price();
	}
}

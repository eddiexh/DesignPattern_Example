package Decorator;

public class Seaweed extends Seasoning {

	public Seaweed(Meal ml) {
		super(ml);
	}

	@Override
	public String eat() {
		return "®ü­a" + ml.eat();
	}

	@Override
	public int price() {
		return 5 + ml.price();
	}
}

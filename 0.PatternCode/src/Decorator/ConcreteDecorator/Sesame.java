package Decorator.ConcreteDecorator;

import Decorator.Meal;
import Decorator.Seasoning;

public class Sesame extends Seasoning {

	public Sesame(Meal ml) {
		super(ml);
	}

	@Override
	public String eat() {
		return "�۳�" + ml.eat();
	}

	@Override
	public int price() {
		return 10 + ml.price();
	}
}

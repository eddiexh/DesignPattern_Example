package Decorator;

public class Rice implements Meal {

	@Override
	public String eat() {
		return "¦Ì¶º";
	}
	
	@Override
	public int price() {
		return 10;
	}
}

package Decorator;

public class Rice implements Meal {

	@Override
	public String eat() {
		return "�̶�";
	}
	
	@Override
	public int price() {
		return 10;
	}
}

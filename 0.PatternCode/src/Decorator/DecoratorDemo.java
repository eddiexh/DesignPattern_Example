package Decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		Meal rice = new Rice();
		Meal mayonnaise = new Mayonnaise(rice);
		Meal seaweed = new Seaweed(mayonnaise);
		Meal sesame = new Sesame(seaweed);
		
		/* 芝麻+海苔+美乃滋+米飯 */
		System.out.println("我吃" + sesame.eat());
		System.out.println("價格" + sesame.price() + "元");
		
		/* 海苔+美乃滋+米飯 */
		System.out.println("我吃" + seaweed.eat());
		System.out.println("價格" + seaweed.price() + "元");
		
		/* 美乃滋+米飯 */
		System.out.println("我吃" + mayonnaise.eat());
		System.out.println("價格" + mayonnaise.price() + "元");
		
		/* 米飯 */
		System.out.println("我吃" + rice.eat());
		System.out.println("價格" + rice.price() + "元");
	}

}

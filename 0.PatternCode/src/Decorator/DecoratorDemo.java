package Decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		Meal rice = new Rice();
		Meal mayonnaise = new Mayonnaise(rice);
		Meal seaweed = new Seaweed(mayonnaise);
		Meal sesame = new Sesame(seaweed);
		
		/* �۳�+���a+���D��+�̶� */
		System.out.println("�ڦY" + sesame.eat());
		System.out.println("����" + sesame.price() + "��");
		
		/* ���a+���D��+�̶� */
		System.out.println("�ڦY" + seaweed.eat());
		System.out.println("����" + seaweed.price() + "��");
		
		/* ���D��+�̶� */
		System.out.println("�ڦY" + mayonnaise.eat());
		System.out.println("����" + mayonnaise.price() + "��");
		
		/* �̶� */
		System.out.println("�ڦY" + rice.eat());
		System.out.println("����" + rice.price() + "��");
	}

}

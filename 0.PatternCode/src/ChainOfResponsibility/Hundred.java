package ChainOfResponsibility;

public class Hundred extends ChangeMoney {

	public Hundred(ChangeMoney cm) {
		super(cm);
	}

	@Override
	public void change(int money) {
		if(money >= 100) {
			int quantity = money / 100;
			System.out.println(quantity + ":100");
		}
		
		doNext(money%100);
	}

}

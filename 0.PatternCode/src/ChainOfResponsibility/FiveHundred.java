package ChainOfResponsibility;

public class FiveHundred extends ChangeMoney {

	public FiveHundred(ChangeMoney cm) {
		super(cm);
	}

	@Override
	public void change(int money) {
		if(money >= 500) {
			int quantity = money / 500;
			System.out.println(quantity + ":500");
		}
		
		doNext(money%500);
	}

}

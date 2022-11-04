package ChainOfResponsibility;

public class Thousand extends ChangeMoney {
	//ConcreteHandler
	public Thousand(ChangeMoney cm) {
		super(cm);
	}

	@Override
	public void change(int money) {
		if(money >= 1000) {
			int quantity = money / 1000;
			System.out.println(quantity + ":1000");
		}
		
		doNext(money%1000);
	}

}

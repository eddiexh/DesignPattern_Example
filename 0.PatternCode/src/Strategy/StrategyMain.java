package Strategy;

public class StrategyMain {

	public static void main(String[] args) {
		String arg = "Hello every one. My name is Leo. Nice to meet you.";
		Context c = new Context();
		c.setContent(arg);
		c.setStrategy(new ConcreteS1());
		c.performStrategy();
		
		System.out.println("\n=================================");
		c.setStrategy(new ConcreteS2());
		c.performStrategy();
	}

}

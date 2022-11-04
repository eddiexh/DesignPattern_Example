package ChainOfResponsibility;

public class CORMain {
	//Client
	public static void main(String[] args) {
		ChangeMoney cm = new Thousand(new FiveHundred(new Hundred(null)));
		
		cm.change(2800);
		System.out.println("===============");
		cm.change(600);
	}
}

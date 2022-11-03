
package ChainOfResponsibility;

public abstract class ChangeMoney {
	protected ChangeMoney cm = null;
	
	public ChangeMoney(ChangeMoney cm) {
		this.cm = cm;
	}
	
	public abstract void change(int money);
	
	public void doNext(int money) {
		if(cm != null) {
			cm.change(money);
		}
	}
}

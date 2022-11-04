package Strategy;

public class Context {
	//Context
	public Strategy s = null;
	public String content = null;
	
	public void setStrategy(Strategy s) {
		this.s = s;
	}
	
	public void setContent(String args) {
		this.content = args;
	}
	
	public void performStrategy() {
		s.perform(content);
	}
}

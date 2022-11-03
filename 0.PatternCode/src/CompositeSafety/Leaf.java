package CompositeSafety;

public class Leaf implements Component {
	
	private String productName = null;
	
	public Leaf(String productName) {
		this.productName = productName;
	}
	
	@Override
	public void print() {
		System.out.println("------" + productName);
	}

}

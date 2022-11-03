package CompositeTransparency;

public class Leaf extends Component {

	private String productName = null;
	
	public Leaf(String productName) {
		this.productName = productName;
	}
	
	@Override
	public void print() {
		System.out.println("------" + productName);
	}

}

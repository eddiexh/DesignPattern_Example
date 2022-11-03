package CompositeTransparency;

import java.util.ArrayList;
//注重透明度，因此將add、remove等操作方法放在component，讓composite覆寫，client可以輕易使用。
public class Composite extends Component {
	
	private String name = null;
	private ArrayList<Component> productList = new ArrayList<>();
	
	public Composite(String name) {
		this.name = name;
	}
	
	public void addComponent(Component c) {
		productList.add(c);
	}
	
	public void removeComponent(int index) {
		productList.remove(index);
	}
	
	@Override
	public void print() {
		System.out.println("========");
		System.out.println("---" + name);
		System.out.println("========");
		
		for(Component product : productList) {
			product.print();
		}
	}
}

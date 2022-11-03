package CompositeSafety;

import java.util.ArrayList;
//注重安全性，因此將add、remove等操作方法放在composite，使得client無法輕易取得。
public class Composite implements Component {
	
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
	
	public void print() {
		System.out.println("========");
		System.out.println("---" + name);
		System.out.println("========");
		
		for(Component product : productList) {
			product.print();
		}
	}
}

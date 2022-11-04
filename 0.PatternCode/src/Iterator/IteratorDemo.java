package Iterator;

public class IteratorDemo {
	//Client
	public static void main(String[] args) {
		List list = new SimpleList();
		list.addItem("1");
		list.addItem("2");
		list.addItem("3");
		list.addItem("4");
		list.addItem("5");
		
		Iterator iterator = list.getIterator();
		//iterator.next()每一個都會跑
		//iterator.next2()只會跑偶數
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

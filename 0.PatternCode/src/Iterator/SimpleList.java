package Iterator;

public class SimpleList extends List {
	//ConcreteAggregate
	private String[] list;
	private int index;
	
	public SimpleList() {
		this.list = new String[100];
		index = 0;
	}
	
	public void addItem(String item) {
		this.list[index] = item;
		index++;
	}
	
	public String[] getList() {
		return this.list;
	}
	
	public Iterator getIterator() {
		return new SimpleIterator(this);
	}
}

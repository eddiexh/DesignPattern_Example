package Iterator;

abstract class List {
	public abstract void addItem(String item);
	
	public abstract String[] getList();
	
	public abstract Iterator getIterator();
}

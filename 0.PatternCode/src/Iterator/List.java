package Iterator;

abstract class List {
	//Aggregate
	public abstract void addItem(String item);
	
	public abstract String[] getList();
	
	public abstract Iterator getIterator();
}

package Iterator;

class SimpleIterator extends Iterator {
	private String[] list;
	private int pos;
	
	public SimpleIterator(SimpleList list) {
		this.list = list.getList();
		pos = 0;
	}
	
	public boolean hasNext() {
		if(list[pos] == null || pos >= list.length) {
			return false;
		}
		
		return true;
	}
	
	public String next2() {
		String s = list[pos];
		pos += 2;
		return s;
	}
	
	public String next() {
		return list[pos++];
	}
}

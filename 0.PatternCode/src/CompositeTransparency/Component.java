package CompositeTransparency;

public abstract class Component {
	public void addComponent(Component c) {
		throw new UnsupportedOperationException();
	}
	public void removeComponent(int index) {
		throw new UnsupportedOperationException();
	}
	public abstract void print();
}

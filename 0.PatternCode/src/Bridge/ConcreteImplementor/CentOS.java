package Bridge.ConcreteImplementor;

import Bridge.UIImp;

public class CentOS implements UIImp {

	@Override
	public void startOS() {
		System.out.println("Starting open CentOS...");
	}
	/* Can do something... */
}

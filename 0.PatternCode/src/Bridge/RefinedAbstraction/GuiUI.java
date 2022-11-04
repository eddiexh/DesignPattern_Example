package Bridge.RefinedAbstraction;

import Bridge.UI;

public class GuiUI extends UI {
	@Override
	public void start() {
		System.out.println("Print GuiUI User Interface...");
		os.startOS();
	}
	
}

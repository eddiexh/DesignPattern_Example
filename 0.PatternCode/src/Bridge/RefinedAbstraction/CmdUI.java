package Bridge.RefinedAbstraction;

import Bridge.UI;

public class CmdUI extends UI {

	@Override
	public void start() {
		System.out.println("Print Cmd User Interface...");
		os.startOS();
	}
	
}

package Command;

import java.util.ArrayList;

public class EditInvoker {
	//Invoker
	ArrayList<Command> cmdList = new ArrayList<Command>();
	
	public void addCommand(Command cmd) {
		cmdList.add(cmd);
	}
	
	public void removeCommand(int index) {
		cmdList.remove(index);
	}
	
	public void go() {
		for(Command cmd : cmdList) {
			cmd.execute();
		}
	}
}

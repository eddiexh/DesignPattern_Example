package Command;

import Command.Command;

public class CutCommand implements Command {
	//ConcreteCommand
	private Document dc;
	
	public CutCommand(Document dc) {
		this.dc = dc;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		dc.cut(1);
	}

}

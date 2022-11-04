package Command;

import Command.Command;

public class CopyCommand implements Command {
	//ConcreteCommand
	private Document dc;
	
	public CopyCommand(Document dc) {
		this.dc = dc;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		dc.copy(1);
	}

}

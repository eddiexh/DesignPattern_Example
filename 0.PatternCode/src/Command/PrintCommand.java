package Command;

import Command.Command;

public class PrintCommand implements Command {
	//ConcreteCommand
	private Document dc;
	
	public PrintCommand(Document dc) {
		this.dc = dc;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		dc.print();
	}

}

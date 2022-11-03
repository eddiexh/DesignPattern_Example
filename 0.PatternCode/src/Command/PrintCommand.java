package Command;

public class PrintCommand implements Command {

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

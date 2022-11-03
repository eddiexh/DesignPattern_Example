package Command;

public class CopyCommand implements Command {

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

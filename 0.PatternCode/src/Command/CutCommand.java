package Command;

public class CutCommand implements Command {

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

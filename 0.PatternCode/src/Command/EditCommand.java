package Command;

public class EditCommand implements Command {

	private Document dc;
	
	public EditCommand(Document dc) {
		this.dc = dc;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		dc.edit("add this sentence to");
	}

}

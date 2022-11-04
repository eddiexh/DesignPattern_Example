package Command;

public class Client {
	//Client
	public static void main(String[] args) {
		//invoker
		EditInvoker ei = new EditInvoker();
		//receiver
		Document dc = new Document();
		//pass receiver into commands
		Command cp = new CopyCommand(dc);
		Command ct = new CutCommand(dc);
		Command et = new EditCommand(dc);
		Command pt = new PasteCommand(dc);
		Command pc = new PrintCommand(dc);
		//pass commands into invoker
		ei.addCommand(pc);
		ei.addCommand(ct);
		ei.addCommand(cp);
		ei.addCommand(et);
		ei.addCommand(ct);
		ei.addCommand(et);
		ei.addCommand(pt);
		ei.addCommand(cp);
		ei.addCommand(pt);
		ei.addCommand(pc);
		
		ei.go();
	}
}

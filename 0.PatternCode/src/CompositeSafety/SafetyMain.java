package CompositeSafety;

public class SafetyMain {

	public static void main(String[] args) {
		Component asus = new Composite("Asus");
		((Composite)asus).addComponent(new Leaf("ROG phone"));
		((Composite)asus).addComponent(new Leaf("Zen phone"));
		
		Component sony = new Composite("Sony");
		((Composite)sony).addComponent(new Leaf("Sony ZX"));
		((Composite)sony).addComponent(new Leaf("Sony Z1"));
		
		Component phoneDm = new Composite("¤â¾÷DM");
		((Composite)phoneDm).addComponent(asus);
		((Composite)phoneDm).addComponent(sony);
		
		phoneDm.print();
	}

}

package CompositeTransparency;

public class TransparencyMain {
	
	public static void main(String[] args) {
		Component asus = new Composite("Asus");

		asus.addComponent(new Leaf("1"));
		asus.addComponent(new Leaf("Zen phone"));
		
		Component sony = new Composite("Sony");
		sony.addComponent(new Leaf("Sony ZX"));
		sony.addComponent(new Leaf("Sony Z1"));
		
		Component phoneDm = new Composite("PhoneDM");
		phoneDm.addComponent(asus);
		phoneDm.addComponent(sony);

		/*Component test = new Component() {
			@Override
			public void print() {

			}
		};
		Component test2 = new Leaf("2");;

		test2.addComponent(phoneDm);
		//test.addComponent(phoneDm);
		//直接使用component的方法會噴錯。因為裡面有寫exception*/

		phoneDm.print();
	}
}

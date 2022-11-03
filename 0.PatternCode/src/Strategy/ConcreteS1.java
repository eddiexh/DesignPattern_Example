package Strategy;

public class ConcreteS1 implements Strategy {

	@Override
	public void perform(String args) {
		int len = 0;
		for(int i = 0; i < args.length(); i++) {
			System.out.print(args.charAt(i));
			len++;
			if(len == 15) {
				System.out.println();
				len = 0;
			}
		}
	}

}

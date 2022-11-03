package Template;

public class TempleteDemo {
	public static void main(String[] args) {
		AbstractTemplate summer = new SummerTemplate();
		AbstractTemplate winter = new WinterTemplate();
		
		System.out.println("==========�L��==========");
		summer.order(); //�L�Ѭ��A
		
		System.out.println("");
		System.out.println("==========�V��==========");
		winter.order(); //�V�Ѭ��A
	}
}

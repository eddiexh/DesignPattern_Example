package Template;

public class TempleteDemo {
	public static void main(String[] args) {
		AbstractTemplate summer = new SummerTemplate();
		AbstractTemplate winter = new WinterTemplate();
		
		System.out.println("==========夏天==========");
		summer.order(); //夏天穿衣服
		
		System.out.println("");
		System.out.println("==========冬天==========");
		winter.order(); //冬天穿衣服
	}
}

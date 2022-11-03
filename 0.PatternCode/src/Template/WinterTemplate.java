package Template;

public class WinterTemplate extends AbstractTemplate {
	
	public void top() {
		System.out.println("穿上長袖");
	}
	
	public void mid() {
		System.out.println("穿上長褲");
	}
	
	@Override
	public void otherClothes() {
		 System.out.println("我還要穿上外套");
	}
}

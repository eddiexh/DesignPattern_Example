package Template;

public abstract class AbstractTemplate {
	//AbstractClass
	public final void order() {
		top();
		mid();
		buttom();
		otherClothes();
	}
	
	abstract public void top();
	
	abstract public void mid();
	
	public void buttom() {
		System.out.println("��W�c�l");
	}
	
	public void otherClothes() {} // Hook method
}

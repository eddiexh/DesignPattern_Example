package Adapter;

public class Demo {

	public static void main(String[] args) {
		TextView tv = new TextView();
		Shape ts = new TextShape(tv);
		Shape ls = new LineShape();
		
		ls.draw();
		System.out.println("\n================\n");
		ts.draw();
	}
}

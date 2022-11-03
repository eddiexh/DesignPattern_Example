package Prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		ShallowSquare shallow = new ShallowSquare(10);
		Color c = shallow.getColor();
		ShallowSquare shallow2 = (ShallowSquare) shallow.clone();
		Color c2 = shallow2.getColor();
		
		System.out.println("=====Shallow Clone Test=====");
		System.out.println("1:" + shallow.getHeight() + ", " + c.getRGB());
		System.out.println("2:" + shallow2.getHeight() + ", " + c2.getRGB());
		
		c2.setRGB("#FFFFFF");
		System.out.println("=====Set Color to White=====");
		System.out.println("4:" + shallow.getHeight() + ", " + c.getRGB());
		System.out.println("5:" + shallow2.getHeight() + ", " + c2.getRGB());
		
		System.out.println("");
		
		DeepSquare deep = new DeepSquare(10);
		Shadow s = deep.getShadow();
		DeepSquare deep2 = (DeepSquare) deep.clone();
		Shadow s2 = deep2.getShadow();
		
		System.out.println("=====Deep Clone Test=====");
		System.out.println("6:" + deep.getHeight() + ", " + s.getHeight());
		System.out.println("7:" + deep2.getHeight() + ", " + s2.getHeight());
		
		s2.setHeight(5);
		deep2.setHeight(5);
		System.out.println("=====set shadow height=====");
		System.out.println("9:" + deep.getHeight() + ", " + s.getHeight());
		System.out.println("10:" + deep2.getHeight() + ", " + s2.getHeight());
	}

}

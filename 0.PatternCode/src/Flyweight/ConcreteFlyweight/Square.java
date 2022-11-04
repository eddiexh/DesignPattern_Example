package Flyweight.ConcreteFlyweight;

import Flyweight.Shape;

public class Square implements Shape {
	private String color;
	private final int x = 10;
	private final int y = 20;
	private final int length = 30;
	
	public Square() {
		
	}

//	 public Square( String color ) {
//	    this.color = color;
//	  }

	  public String getColor() {
	    return color;
	  }

	  public void setColor( String color ) {
	    this.color = color;
	  }

	  @Override
	  public void draw() {
	    System.out.println(this+" : \nSquare: \n\tDraw() [Color : " + color + ", x : " + x + ", y :" + y + ", length :" + length + "]");
	  }
}

package Flyweight;

import java.util.HashMap;

public class ShapeFactory {
	private static final HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();

	  public static Shape getShape(String shapeType) {
	    Shape shape = null;
	    if(shapeType.equals("circle")) {
	      shape = (Circle) shapeMap.get("circle");

	      if(shape == null) 
	      {
	        shape = new Circle();
	        shapeMap.put("circle", shape);
	        System.out.println("Creating circle object without any color in shapefactory : \n\t\t" + shape + "\n");
	      }
	    }
	    else if (shapeType.equals("square")) {
	    	shape = (Square) shapeMap.get("square");

	    	if(shape == null) 
	    	{
	    		shape = new Square();
	    		shapeMap.put("square", shape);
	    		System.out.println("Creating square object without any color in shapefactory : \n\t\t" + shape + "\n");
	    	}
	    }
	    return shape;
	  }
}

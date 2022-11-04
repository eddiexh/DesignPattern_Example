package Flyweight;

import Flyweight.ConcreteFlyweight.Circle;
import Flyweight.ConcreteFlyweight.Square;

public class Demo {
	//Client
	private static final String colors[] = { "Red", "Green", "Blue", "Orange", "Black" };

	public static void main( String[] args ) {
		System.out.println("\n==================== Red color Circles ====================");
		for( int i = 0; i < 5; ++i ) {
		  Circle circle = (Circle) ShapeFactory.getShape("circle");
		  circle.setColor(colors[0]);
		  circle.draw();
		}
		System.out.println("\n==================== Green color Circles ====================");
		for( int i = 0; i < 5; ++i ) {
		  Circle circle = (Circle) ShapeFactory.getShape("circle");
		  circle.setColor(colors[1]);
		  circle.draw();
		}
		System.out.println("\n==================== Blue color Circles ====================");
		
		for( int i = 0; i < 5; ++i ) {
		  Circle circle = (Circle) ShapeFactory.getShape("circle");
		  circle.setColor(colors[2]);
		  circle.draw();
		}
		System.out.println("\n==================== Orange color Squares ====================");
		for( int i = 0; i < 5; ++i ) {
			Square circle = (Square) ShapeFactory.getShape("square");
			circle.setColor(colors[3]);
			circle.draw();
		}
		System.out.println("\n==================== Black color Squares ====================");
		for( int i = 0; i < 5; ++i ) {
			Square circle = (Square) ShapeFactory.getShape("square");
			circle.setColor(colors[4]);
			circle.draw();
		}
	}
}

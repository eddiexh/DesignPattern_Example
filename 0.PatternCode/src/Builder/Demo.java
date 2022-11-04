package Builder;

import Builder.ConcreteBuilder.SedanCarBuilder;
import Builder.ConcreteBuilder.SportsCarBuilder;
import Builder.ConcreteDirector.CarDirector1;

public class Demo {
	public static void main(String[] args) {
		CarBuilder carBuilder = new SedanCarBuilder();
		CarDirector1 director = new CarDirector1(carBuilder);
		director.build();
		Car car = carBuilder.getCar();
		System.out.println(car);
		
		carBuilder = new SportsCarBuilder();
		director = new CarDirector1(carBuilder);
		director.build();
		car = carBuilder.getCar();
		System.out.println(car);
	}
}

package Builder;

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

package Builder;

public class CarDirector1 extends Director {
	public CarDirector1(CarBuilder carBuilder){
		super(carBuilder);
	}

	public void build(){
		carBuilder.buildBodyStyle();
		carBuilder.buildPower();
		carBuilder.buildEngine();
		carBuilder.buildBreaks();
		carBuilder.buildSeats();
		carBuilder.buildWindows();
		carBuilder.buildFuelType();
	}
}

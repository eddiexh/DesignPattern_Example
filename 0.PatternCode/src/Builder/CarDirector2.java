package Builder;

public class CarDirector2 extends Director {
	public CarDirector2(CarBuilder carBuilder){
		super(carBuilder);
	}

	public void build(){
		carBuilder.buildSeats();
		carBuilder.buildBodyStyle();
		carBuilder.buildPower();
		carBuilder.buildBreaks();
		carBuilder.buildEngine();
		carBuilder.buildWindows();
		carBuilder.buildFuelType();
	}
}

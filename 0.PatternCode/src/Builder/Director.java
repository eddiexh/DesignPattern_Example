package Builder;

public abstract class Director {
	//Director
	protected CarBuilder carBuilder;
	
	public Director(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}
	
	public abstract void build();
}

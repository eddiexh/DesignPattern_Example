package Builder;

public class Car {
	//Product
	private String bodyStyle;
	private String power;
	private String engine;
	private String breaks;
	private String seats;
	private String windows;
	private String fuelType;
	private String carType;
	
	public Car (String carType){
		this.carType = carType;
	}
	
	public String getBodyStyle() {
		return bodyStyle;
	}
	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getBreaks() {
		return breaks;
	}
	public void setBreaks(String breaks) {
		this.breaks = breaks;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	public String getWindows() {
		return windows;
	}
	public void setWindows(String windows) {
		this.windows = windows;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("--------------"+carType+"--------------------- \n");
		sb.append(" Body: \n\t");
		sb.append(bodyStyle);
		sb.append("\n Power: \n\t");
		sb.append(power);
		sb.append("\n Engine: \n\t");
		sb.append(engine);
		sb.append("\n Breaks: \n\t");
		sb.append(breaks);
		sb.append("\n Seats: \n\t");
		sb.append(seats);
		sb.append("\n Windows: \n\t");
		sb.append(windows);
		sb.append("\n Fuel Type: \n\t");
		sb.append(fuelType);
		
		return sb.toString();
	}
}

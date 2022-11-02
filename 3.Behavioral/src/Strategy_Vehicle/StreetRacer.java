package Strategy_Vehicle;

public class StreetRacer extends Vehicle {
    public StreetRacer() {
        setGoAlgorithm(new GoByDriving());
    }
}

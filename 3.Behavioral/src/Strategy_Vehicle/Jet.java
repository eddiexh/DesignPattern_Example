package Strategy_Vehicle;

public class Jet extends Vehicle {
    public Jet() {
        setGoAlgorithm(new GoByFlyingFast());
    }
}

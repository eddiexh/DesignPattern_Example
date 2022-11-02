package Strategy_Vehicle;

public class Helicopter extends Vehicle {
    public Helicopter() {
        setGoAlgorithm(new GoByFlying());
    }
}

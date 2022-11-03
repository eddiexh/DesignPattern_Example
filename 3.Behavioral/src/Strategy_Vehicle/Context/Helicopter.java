package Strategy_Vehicle.Context;

import Strategy_Vehicle.Strategy.GoByFlying;
import Strategy_Vehicle.Vehicle;

public class Helicopter extends Vehicle {
    //ConcreteContext
    public Helicopter() {
        setGoAlgorithm(new GoByFlying());
    }
}

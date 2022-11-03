package Strategy_Vehicle.Context;

import Strategy_Vehicle.Strategy.GoByFlyingFast;
import Strategy_Vehicle.Vehicle;

public class Jet extends Vehicle {
    //ConcreteContext
    public Jet() {
        setGoAlgorithm(new GoByFlyingFast());
    }
}

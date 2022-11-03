package Strategy_Vehicle.Context;

import Strategy_Vehicle.Strategy.GoByDriving;
import Strategy_Vehicle.Vehicle;

public class StreetRacer extends Vehicle {
    //ConcreteContext
    public StreetRacer() {
        setGoAlgorithm(new GoByDriving());
    }
}

package Strategy_Vehicle.ConcreteContext;

import Strategy_Vehicle.ConcreteStrategy.GoByDriving;
import Strategy_Vehicle.Context;

public class StreetRacer extends Context {
    //ConcreteContext
    public StreetRacer() {
        setGoAlgorithm(new GoByDriving());
    }
}

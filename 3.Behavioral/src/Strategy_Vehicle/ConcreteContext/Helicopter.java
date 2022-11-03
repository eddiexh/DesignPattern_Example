package Strategy_Vehicle.ConcreteContext;

import Strategy_Vehicle.ConcreteStrategy.GoByFlying;
import Strategy_Vehicle.Context;

public class Helicopter extends Context {
    //ConcreteContext
    public Helicopter() {
        setGoAlgorithm(new GoByFlying());
    }
}

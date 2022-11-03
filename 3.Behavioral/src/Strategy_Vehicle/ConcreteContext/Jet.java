package Strategy_Vehicle.ConcreteContext;

import Strategy_Vehicle.ConcreteStrategy.GoByFlyingFast;
import Strategy_Vehicle.Context;

public class Jet extends Context {
    //ConcreteContext
    public Jet() {
        setGoAlgorithm(new GoByFlyingFast());
    }
}

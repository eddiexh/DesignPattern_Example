package Strategy_Vehicle.ConcreteStrategy;

import Strategy_Vehicle.Strategy;

public class GoByFlyingFast implements Strategy {
    //ConcreteStrategy
    public void go() {
        System.out.println("Now I'm flying fast.");
    }
}

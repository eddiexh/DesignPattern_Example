package Strategy_Vehicle.Strategy;

import Strategy_Vehicle.GoAlgorithm;

public class GoByDriving implements GoAlgorithm {
    //ConcreteStrategy
    public void go() {
        System.out.println("Now I'm driving.");
    }
}

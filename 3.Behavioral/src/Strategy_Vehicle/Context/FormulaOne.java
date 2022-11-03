package Strategy_Vehicle.Context;

import Strategy_Vehicle.Strategy.GoByDriving;
import Strategy_Vehicle.Vehicle;

public class FormulaOne extends Vehicle {
    //ConcreteContext
    public FormulaOne() {
        setGoAlgorithm(new GoByDriving());
    }
}

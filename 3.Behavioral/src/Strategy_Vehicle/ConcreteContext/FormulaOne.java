package Strategy_Vehicle.ConcreteContext;

import Strategy_Vehicle.ConcreteStrategy.GoByDriving;
import Strategy_Vehicle.Context;

public class FormulaOne extends Context {
    //ConcreteContext
    public FormulaOne() {
        setGoAlgorithm(new GoByDriving());
    }
}

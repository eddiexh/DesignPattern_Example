package Strategy_Vehicle;

public class FormulaOne extends Vehicle {
    public FormulaOne() {
        setGoAlgorithm(new GoByDriving());
    }
}

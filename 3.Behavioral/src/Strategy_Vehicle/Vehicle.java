package Strategy_Vehicle;

public abstract class Vehicle {
    //Context
    private GoAlgorithm algorithm;
    public void setGoAlgorithm(GoAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void go() {
        algorithm.go();
    }
}

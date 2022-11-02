package Strategy_Vehicle;

public abstract class Vehicle {
    private GoAlgorithm algorithm;
    public void setGoAlgorithm(GoAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void go() {
        algorithm.go();
    }
}

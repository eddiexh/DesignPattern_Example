package Strategy_Vehicle;

public abstract class Context {
    //Context
    private Strategy s;
    public void setGoAlgorithm(Strategy s) {
        this.s = s;
    }

    public void go() {
        s.go();
    }
}

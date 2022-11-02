package State_CruiseControlSystem;

public class IncreasingSpeed extends CruiseActivated {
    void leverReleased(CruiseControl c) {
        System.out.println("IncreasingSpeed change to Cruising");
        c.setState(new Cruising());
    }
}

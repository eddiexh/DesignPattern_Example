package State_CruiseControlSystem;

import State_CruiseControlSystem.CruiseActivated;

public class IncreasingSpeed extends CruiseActivated {
    //Context
    void leverReleased(CruiseControl c) {
        System.out.println("IncreasingSpeed change to Cruising");
        c.setState(new Cruising());
    }
}

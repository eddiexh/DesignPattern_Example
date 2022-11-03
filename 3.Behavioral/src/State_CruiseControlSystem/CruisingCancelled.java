package State_CruiseControlSystem;

import State_CruiseControlSystem.CruiseActivated;

public class CruisingCancelled extends CruiseActivated {
    @Override
    void leverDown(CruiseControl c) {
        System.out.println("CruisingCancelled change to Cruising");
        setDesiredSpeed(c);
        c.setState(new Cruising());
    }
    @Override
    void leverUp(CruiseControl c) {
        System.out.println("CruisingCancelled change to Cruising");
        c.setState(new Cruising());
    }
    @Override
    void leverDownAndHold(CruiseControl c) {
        System.out.println("CruisingCancelled change to DecreasingSpeed");
        c.setState(new DecreasingSpeed());
    }
    @Override
    void leverUpAndHold(CruiseControl c) {
        System.out.println("CruisingCancelled change to IncreasingSpeed");
        c.setState(new IncreasingSpeed());
    }
}

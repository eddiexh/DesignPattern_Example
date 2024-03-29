package State_CruiseControlSystem;

import State_CruiseControlSystem.CruiseActivated;

public class Cruising extends CruiseActivated {
    //ConcreteState
    @Override
    void leverDown(CruiseControl c) {
        System.out.println("Cruising change to Cruising");
        setDesiredSpeed(c);
        c.setState(new Cruising());
    }
    @Override
    void brakeApplied(CruiseControl c) {
        System.out.println("Cruising change to CruisingCancelled");
        c.setState(new CruisingCancelled());
    }
    @Override
    void leverDownAndHold(CruiseControl c) {
        System.out.println("Cruising change to DecreasingSpeed");
        c.setState(new DecreasingSpeed());
    }

    @Override
    void leverUpAndHold(CruiseControl c) {
        System.out.println("Cruising change to IncreasingSpeed");
        c.setState(new IncreasingSpeed());
    }

    @Override
    void leverPulled(CruiseControl c) {
        System.out.println("Cruising change to CruisingCancelled");
        c.setState(new CruisingCancelled());
    }
}

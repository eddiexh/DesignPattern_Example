package State_CruiseControlSystem;

import State_CruiseControlSystem.CruiseActivated;

public class DecreasingSpeed extends CruiseActivated {
    //Context
    @Override
    void leverReleased(CruiseControl c){
        System.out.println("DecreasingSpeed change to Cruising");
        setDesiredSpeed(c);
        c.setState(new Cruising());
    }
}


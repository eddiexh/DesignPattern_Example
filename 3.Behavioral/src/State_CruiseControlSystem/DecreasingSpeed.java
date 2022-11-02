package State_CruiseControlSystem;

public class DecreasingSpeed extends CruiseActivated{
    @Override
    void leverReleased(CruiseControl c){
        System.out.println("DecreasingSpeed change to Cruising");
        setDesiredSpeed(c);
        c.setState(new Cruising());
    }
}


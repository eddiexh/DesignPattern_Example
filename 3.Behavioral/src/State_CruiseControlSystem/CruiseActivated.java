package State_CruiseControlSystem;

public class CruiseActivated extends State {
    //ConcreteState
    @Override
    void onOffButtonPressed(CruiseControl c) {
        // TODO Auto-generated method stub
        System.out.println("CruiseActivated change to CruiseDeactivated");
        c.setState(new CruiseDeactivated());
    }
    @Override
    void leverDown(CruiseControl c) {}
    @Override
    void leverUp(CruiseControl c) {}
    @Override
    void brakeApplied(CruiseControl c) {}
    @Override
    void leverDownAndHold(CruiseControl c) {}
    @Override
    void leverUpAndHold(CruiseControl c) {}
    @Override
    void leverPulled(CruiseControl c) {}
    @Override
    void leverReleased(CruiseControl c) {}
}

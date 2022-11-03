package State_CruiseControlSystem;

public abstract class State {
    //State
    State[] states;

    abstract void leverDown(CruiseControl c);
    abstract void leverUpAndHold(CruiseControl c);
    abstract void leverDownAndHold(CruiseControl c);
    abstract void leverReleased(CruiseControl c);
    abstract void leverPulled(CruiseControl c);
    abstract void brakeApplied(CruiseControl c);
    abstract void leverUp(CruiseControl c);
    abstract void onOffButtonPressed(CruiseControl c);

    void setDesiredSpeed(CruiseControl c) {
        System.out.println("setDesiredSpeed");
    }
}

package State_CruiseControlSystem;

import State_CruiseControlSystem.CruiseDeactivated;

public class CruiseControl {
    //Context
    State state;
    public CruiseControl() {
        // TODO Auto-generated constructor stub
        this.state = new CruiseDeactivated();
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    void onOffButtonPressed() {
        state.onOffButtonPressed(this);
    }
    void leverDown() {
        state.leverDown(this);
    }
    void leverUp() {
        state.leverUp(this);
    }
    void brakeApplied() {
        state.brakeApplied(this);
    }
    void leverDownAndHold() {
        state.leverDownAndHold(this);
    }
    void leverUpAndHold() {
        state.leverUpAndHold(this);
    }
    void leverPulled() {
        state.leverPulled(this);
    }
    void leverReleased() {
        state.leverReleased(this);
    }
}

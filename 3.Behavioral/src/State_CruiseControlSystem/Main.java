package State_CruiseControlSystem;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CruiseControl cruiseControl = new CruiseControl();
        cruiseControl.onOffButtonPressed();
        cruiseControl.leverDown();
        cruiseControl.onOffButtonPressed();
    }
}

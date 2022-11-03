package Command_SimpleRemoteControl;

public class GarageDoor {
    //Invoker
    public GarageDoor() {}
    public void up() {
        System.out.println("Garage Door is Open");
    }

    public void down() {
        System.out.println("Garage Door is Closed");
    }

    public void stop() {
        System.out.println("Garage Door is Stopped");
    }

    public void lightOn() {
        System.out.println("Garage light is on");
    }

    public void lightOff() {
        System.out.println("Garage light is off");
    }
    public void Off() {
        System.out.println("Garage Door is off");
    }
}

package Command_SimpleRemoteControl;

public class SimpleRemoteControlClient{
    public static void main(String[] args) {
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Command lightOnCommand = new LightOnCommand(light);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();

        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor );
        remoteControl.setCommand(garageDoorOpenCommand );
        remoteControl.buttonWasPressed();
    }
}

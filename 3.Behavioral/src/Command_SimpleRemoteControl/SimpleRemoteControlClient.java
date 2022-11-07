package Command_SimpleRemoteControl;

import Command_SimpleRemoteControl.ConcreteCommand.GarageDoorOpenCommand;
import Command_SimpleRemoteControl.ConcreteCommand.LightOnCommand;

public class SimpleRemoteControlClient{
    //Client
    public static void main(String[] args) {
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Command lightOnCommand = new LightOnCommand(light);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();

        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor );
        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.buttonWasPressed();
    }
}

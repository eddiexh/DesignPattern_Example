package Command_SimpleRemoteControl.ConcreteCommand;

import Command_SimpleRemoteControl.Command;
import Command_SimpleRemoteControl.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    //ConcreteCommand
    //Have its suitable receiver
    GarageDoor garageDoor;
    //Specify the Constructor
    public GarageDoorOpenCommand (GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    //Execute the garageDoor.up() function
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        garageDoor.up();
    }
}

package Command_SimpleRemoteControl;

public class GarageDoorOpenCommand implements Command {
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

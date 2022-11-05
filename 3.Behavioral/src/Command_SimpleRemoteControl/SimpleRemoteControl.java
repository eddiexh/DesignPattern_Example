package Command_SimpleRemoteControl;

public class SimpleRemoteControl {
    //Invoker
    Command slot;
    public SimpleRemoteControl() {}

    //Describe the important function of the invoker
    public void setCommand(Command command) {
        this.slot = command;
    }
    public void buttonWasPressed() {
        slot.execute();
    }
}

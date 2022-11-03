package Command_SimpleRemoteControl.ConcreteCommand;

import Command_SimpleRemoteControl.Command;
import Command_SimpleRemoteControl.Light;

//Then describe the LightOnCommand implements Command
public class LightOnCommand implements Command {
    //ConcreteCommand
    Light light;
    public LightOnCommand (Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        light.on();
    }
}

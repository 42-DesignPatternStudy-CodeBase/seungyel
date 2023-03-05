package commandPattern.RemoteControl;

import commandPattern.Command;

public class ControlButton {
    Command onCommand;
    Command offCommand;

    public ControlButton(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void pressOnCommand() {
        this.onCommand.execute();
    }

    public void pressOffCommand() {
        this.offCommand.execute();
    }

    public String toString() {
        return "ControlButton [onCommand=" + onCommand + ", offCommand=" + offCommand + "]";
    }
}
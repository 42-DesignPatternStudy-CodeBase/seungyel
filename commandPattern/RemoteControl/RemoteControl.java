package commandPattern.RemoteControl;

import commandPattern.Command;
import java.util.HashMap;

public class RemoteControl {
    HashMap<Integer, ControlButton> buttons = new HashMap<Integer, ControlButton>();

    public RemoteControl() {}

    public void setCommand(int id, Command onCommand, Command offCommand) {
        buttons.put(id, new ControlButton(onCommand, offCommand));
    }

    public void onButtonWasPushed(int id) {
        ControlButton found = buttons.get(id); // 못찾으면 null리턴
        if (found != null) {
            found.pressOnCommand();
        } else {
            System.out.println("Error : unregistered command");
        }
    }

    public void offButtonWasPushed(int id) {
        ControlButton found = buttons.get(id); // 못찾으면 null리턴
        if (found != null) {
            found.pressOffCommand();
        } else {
            System.out.println("Error : unregistered command");
        }
    }

    public String toString() {
        return buttons.toString();
    }
}
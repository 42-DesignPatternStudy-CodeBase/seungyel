package commandPattern.GarageDoor;

import commandPattern.Command;

public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor ceilingFan) {
      this.garageDoor = ceilingFan;
    }

    public void execute() {
      garageDoor.down();
    }
}

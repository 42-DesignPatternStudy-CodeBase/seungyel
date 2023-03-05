package commandPattern.Light;

import commandPattern.Command;

// 수신자 가지고 있고...
// excute는...
// 수신자가 동작해야할 걸 실행하고 있는 그런 느낌...?!
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
      this.light = light;
    }

    public void execute() {
      light.on();
    }
}

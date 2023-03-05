package commandPattern.Stereo;

import commandPattern.Command;

public class StereoOffCommand implements Command {
    Stereo stereo;
    
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
      }

    @Override
    public void execute() {
        stereo.turnOffMusic();
    }
}

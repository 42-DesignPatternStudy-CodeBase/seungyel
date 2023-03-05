package commandPattern.Stereo;

import commandPattern.Command;


public class StereoOnWithCDCommand implements Command{
    Stereo stereo;
    
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
      }

    @Override
    public void execute() {
        stereo.turnOnMusic();
    }
}

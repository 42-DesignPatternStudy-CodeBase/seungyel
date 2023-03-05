package commandPattern.Stereo;

public class Stereo {
    String location = "";

    public Stereo(String location) {
        this.location = location;
    }
    public void turnOnMusic() {
        System.out.println(location + " stereo music is on");
    }
    public void turnOffMusic() {
        System.out.println(location + " stereo music is off");
    } 
}

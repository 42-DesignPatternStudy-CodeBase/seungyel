package commandPattern.CeilingFan;

public class CeilingFan {
    String location = "";

    public CeilingFan(String location) {
        this.location = location;
    }
    public void on() {
        System.out.println(location + " light is on");
    }
    public void off() {
        System.out.println(location + " light is off");
    } 
}

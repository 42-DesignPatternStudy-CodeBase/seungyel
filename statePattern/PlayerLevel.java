package statePattern;

// public interface PlayerLevel {
//     // public default void defaultMethod() {}
//     public void fooMethod();
//     public void fooMethod2();
// }

public abstract class PlayerLevel {
    public static final int BEGINNER_LEVEL = 1; 
    public static final int ADVANCED_LEVEL = 2; 
    public static final int SUPER_LEVEL = 3;

    protected int level;
    protected String runMessage;
    protected String jumpMessage;
    protected String turnMessage;

    public void run() {
        System.out.println(runMessage);
    }
    public void jump() {
        System.out.println(jumpMessage);
    }
    public void turn() {
        System.out.println(turnMessage);
    }
    public void showLevelMessage() {
    }
    
    public void go(int where) {
        System.out.println(where + "번에 같이 가요.");
    }
    public int getLevel() { return level; }
}

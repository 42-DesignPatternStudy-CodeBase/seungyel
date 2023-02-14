package statePattern;

public class BeginnerLevel extends PlayerLevel {
    BeginnerLevel() {
        this.level = BEGINNER_LEVEL;
		this.runMessage = "천천히 달립니다.";
		this.jumpMessage = "Jump 할 줄 모르지롱.";
		this.turnMessage = "Turn 할 줄 모르지롱..";
    }
}
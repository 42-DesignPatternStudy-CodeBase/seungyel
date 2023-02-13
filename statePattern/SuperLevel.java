package statePattern;

public class SuperLevel extends PlayerLevel {

    SuperLevel() {
        this.level = SUPER_LEVEL;
        this.runMessage = "엄청 빨리 달립니다.";
        this.jumpMessage = "아주 높이 jump 합니다.";
        this.turnMessage = "한 바퀴 돕니다.";
    }
}

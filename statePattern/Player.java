package statePattern;

public class Player {

    private PlayerLevel level = new BeginnerLevel();

    public int getLevel() {
        return this.level.getLevel();
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }

    public void play(int time) {
        this.level.run();
        for(int i = 0; i < time; i++) {
            this.level.jump();
        }
        this.level.turn();
        this.level.go(time);
    }
}

package memento.gameSaver;

public enum Missions {
    TRAINING, FIRST_MISSION, SECOND_MISSION, THIRD_MISSION, FINAL_BOSS;

    private static Missions[] values = values();

    public Missions next() {
        return values[(this.ordinal()+1) % values.length];
    }
}

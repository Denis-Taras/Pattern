package mediator.SmartHouseController.model;

public enum Status {
    COLD, WARM, COMFORT, HOT, BURN_BABY_BURN;

    private static Status[] values = values();

    public Status next() {
        return values[(this.ordinal()+1) % values.length];
    }

    public Status previous() {
        return values[(this.ordinal()-1) % values.length];
    }
}

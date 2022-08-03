package mediator.SmartHouseController.model;

public class Kitchen {
    private Status status;

    public Kitchen(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
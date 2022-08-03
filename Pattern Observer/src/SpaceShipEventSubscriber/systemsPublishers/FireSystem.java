package src.SpaceShipEventSubscriber.systemsPublishers;

import src.SpaceShipEventSubscriber.events.Event;
import src.SpaceShipEventSubscriber.events.FireSystemEvents;
import src.SpaceShipEventSubscriber.statuses.FireSystemStatus;

public class FireSystem implements Publisher{

    private FireSystemStatus status;
    private Event event;

    public FireSystem(FireSystemEvents event) {
        this.status = FireSystemStatus.NORMAL;
        this.event = event;
    }

    public FireSystemStatus getStatus() {
        return status;
    }

    public void setStatus(FireSystemStatus status) {
        this.status = status;
        this.notifySubscribers(event);
    }
}

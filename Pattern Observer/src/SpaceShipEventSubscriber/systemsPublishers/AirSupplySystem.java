package src.SpaceShipEventSubscriber.systemsPublishers;

import src.SpaceShipEventSubscriber.events.AirSupplySystemEvents;
import src.SpaceShipEventSubscriber.events.Event;
import src.SpaceShipEventSubscriber.statuses.AirSystemStatus;

public class AirSupplySystem implements Publisher{

    private AirSystemStatus status;
    private Event event;

    public AirSupplySystem(AirSupplySystemEvents event) {
        this.status = AirSystemStatus.NORMAL;
        this.event = event;
    }

    public AirSystemStatus getStatus() {
        return status;
    }

    public void setStatus(AirSystemStatus status) {
        this.status = status;
        this.notifySubscribers(event);
    }
}

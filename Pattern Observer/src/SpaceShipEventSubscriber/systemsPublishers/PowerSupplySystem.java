package src.SpaceShipEventSubscriber.systemsPublishers;

import src.SpaceShipEventSubscriber.events.Event;
import src.SpaceShipEventSubscriber.events.PowerSystemEvents;
import src.SpaceShipEventSubscriber.statuses.PowerSystemStatus;

public class PowerSupplySystem implements Publisher{
    private PowerSystemStatus status;
    private Event event;

    public PowerSupplySystem(PowerSystemEvents event) {
        this.status = PowerSystemStatus.NORMAL;
        this.event = event;
    }

    public PowerSystemStatus getStatus() {
        return status;
    }

    public void setStatus(PowerSystemStatus status) {
        this.status = status;
        this.notifySubscribers(event);
    }
}

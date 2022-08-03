package src.SpaceShipEventSubscriber.controlPanelsSubscribers;

import src.SpaceShipEventSubscriber.events.Event;

public interface Subscriber {

    void updateContext(Event event);
}

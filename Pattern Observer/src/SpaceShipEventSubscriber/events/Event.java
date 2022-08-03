package src.SpaceShipEventSubscriber.events;

import src.SpaceShipEventSubscriber.controlPanelsSubscribers.Subscriber;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Event {

    private String eventName;
    private Set<Subscriber> listOfSubscribers;

    public Event (String eventName) {
        this.eventName = eventName;
        this.listOfSubscribers = new HashSet<>();
    }

    public Set<Subscriber> getListOfSubscribers() {
        return listOfSubscribers;
    }

    public String getEventName() {
        return eventName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return eventName.equals(event.eventName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName);
    }
}

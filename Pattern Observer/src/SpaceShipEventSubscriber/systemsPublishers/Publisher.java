package src.SpaceShipEventSubscriber.systemsPublishers;

import src.SpaceShipEventSubscriber.controlPanelsSubscribers.Subscriber;
import src.SpaceShipEventSubscriber.events.Event;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public interface Publisher {
    Set<Event> events = new HashSet<>();

    default void subscribe(Event event, Subscriber subscriber) {
        if(!events.contains(event)) {
            event.getListOfSubscribers().add(subscriber);
            events.add(event);
        } else {
            Iterator<Event> iterator = events.iterator();
            while (iterator.hasNext()) {
                Event e = iterator.next();
                if (e.equals(event))
                    e.getListOfSubscribers().add(subscriber);
            }
        }
        System.out.println("The object " + subscriber.getClass().getSimpleName() + " has been subscribed for the event: " + event.getEventName());
    }

    default void unSubscribe(Event event, Subscriber subscriber) {
        if(events.contains(event)) {
            for (Iterator<Event> iterator = events.iterator(); iterator.hasNext(); ) {
                Event e = iterator.next();
                if (e.equals(event)) {
                    e.getListOfSubscribers().remove(subscriber);
                    System.out.println("Subscription was removed!");
                    break;
                }
            }
        } else {
            System.out.println("No such event!");
        }
    }
    default void notifySubscribers(Event event) {
        Iterator<Subscriber> iterator = event.getListOfSubscribers().iterator();
        while (iterator.hasNext()) {
            Subscriber subscriber = iterator.next();
            subscriber.updateContext(event);
        }
    }
}

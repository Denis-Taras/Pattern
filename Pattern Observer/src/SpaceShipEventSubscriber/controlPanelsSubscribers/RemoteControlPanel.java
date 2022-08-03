package src.SpaceShipEventSubscriber.controlPanelsSubscribers;

import src.SpaceShipEventSubscriber.events.Event;
import src.SpaceShipEventSubscriber.systemsPublishers.AirSupplySystem;
import src.SpaceShipEventSubscriber.systemsPublishers.FireSystem;

public class RemoteControlPanel implements Subscriber{

    private AirSupplySystem airSupplySystem;
    private FireSystem fireSystem;

    public RemoteControlPanel(AirSupplySystem airSupplySystem, FireSystem fireSystem) {
        this.airSupplySystem = airSupplySystem;
        this.fireSystem = fireSystem;
    }

    @Override
    public void updateContext(Event event) {
        if(event.getEventName().equals("AirSupplySystemEvents")) {
            System.out.println("Remote control panel:");
            System.out.println("Air supply system status: " + airSupplySystem.getStatus());
        } else if(event.getEventName().equals("FireSystemEvents")) {
            System.out.println("Remote control panel:");
            System.out.println("Fire system status: " + fireSystem.getStatus());
        }
    }
}

package src.SpaceShipEventSubscriber.controlPanelsSubscribers;

import src.SpaceShipEventSubscriber.events.Event;
import src.SpaceShipEventSubscriber.systemsPublishers.AirSupplySystem;
import src.SpaceShipEventSubscriber.systemsPublishers.FireSystem;
import src.SpaceShipEventSubscriber.systemsPublishers.PowerSupplySystem;

public class MainControlPanel implements Subscriber{

    private AirSupplySystem airSupplySystem;
    private FireSystem fireSystem;
    private PowerSupplySystem powerSupplySystem;

    public MainControlPanel(AirSupplySystem airSupplySystem, FireSystem fireSystem, PowerSupplySystem powerSupplySystem) {
        this.airSupplySystem = airSupplySystem;
        this.fireSystem = fireSystem;
        this.powerSupplySystem = powerSupplySystem;
    }

    @Override
    public void updateContext(Event event) {
        if(event.getEventName().equals("AirSupplySystemEvents")) {
            System.out.println("Main control panel:");
            System.out.println("Air supply system status: " + airSupplySystem.getStatus());
        } else if(event.getEventName().equals("FireSystemEvents")) {
            System.out.println("Main control panel:");
            System.out.println("Fire system status: " + fireSystem.getStatus());
        } else if(event.getEventName().equals("PowerSystemEvents")) {
            System.out.println("Main control panel:");
            System.out.println("Power supply system status: " + powerSupplySystem.getStatus());
        }
    }
}

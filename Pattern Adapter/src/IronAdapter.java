import model.Aircraft;
import model.SimpleDevice;

public class IronAdapter implements SimpleDevice {

    Aircraft aircraft;

    public IronAdapter(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public void turnOn() {
        System.out.println("///---method turnOn---///");
        aircraft.startEngines();
    }

    @Override
    public void turnOff() {
        aircraft.stopEngines();
    }

    @Override
    public void warmUp() {
        if (aircraft.isEnginesStarted) {
            System.out.println("///---Engines were started before---///");
            if (aircraft.isOnRunway) {
                System.out.println("///---Aircraft was on the RW before---///");
                aircraft.takeOff();
            } else {
                aircraft.taxiToRunway();
                aircraft.takeOff();
            }
        } else {
            aircraft.startEngines();
            aircraft.taxiToRunway();
            aircraft.takeOff();
        }
    }
}
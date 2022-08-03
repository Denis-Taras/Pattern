package state.droneFlightControl.states.interfaces;

import state.droneFlightControl.FlightControlSystem;
import state.droneFlightControl.FlightPhase;

public abstract class State {

    private boolean isLandingGearsExtended;
    private boolean isFlapsExtended;
    private boolean isDroneOnTheGround;
    private int altitude;
    private FlightPhase flightPhase;

    public State() {
        this.isLandingGearsExtended = true;
        this.isFlapsExtended = false;
        this.isDroneOnTheGround = true;
        this.altitude = 0;
        this.flightPhase = FlightPhase.ON_THE_GROUND;
    }

    public boolean isLandingGearsExtended() {
        return isLandingGearsExtended;
    }

    public void setLandingGearsExtended(boolean landingGearsExtended) {
        isLandingGearsExtended = landingGearsExtended;
    }

    public boolean isFlapsExtended() {
        return isFlapsExtended;
    }

    public void setFlapsExtended(boolean flapsExtended) {
        isFlapsExtended = flapsExtended;
    }

    public boolean isDroneOnTheGround() {
        return isDroneOnTheGround;
    }

    public void setDroneOnTheGround(boolean droneOnTheGround) {
        isDroneOnTheGround = droneOnTheGround;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public FlightPhase getFlightPhase() {
        return flightPhase;
    }

    public void setFlightPhase(FlightPhase flightPhase) {
        this.flightPhase = flightPhase;
    }

    public abstract void takeOff(FlightControlSystem flightControlSystem);

    public abstract void climb(FlightControlSystem flightControlSystem, int altitude);

    public abstract void descent(FlightControlSystem flightControlSystem, int altitude);

    public abstract void landing(FlightControlSystem flightControlSystem);

    public void getStatusOfFlight() {
        System.out.println("Landing Gears is Extended: " + isLandingGearsExtended);
        System.out.println("Landing Flaps is Extended: " + isFlapsExtended);
        System.out.println("Is Drone on the ground: " + isDroneOnTheGround);
        System.out.println("Altitude is: " + altitude);
        System.out.println("The phase of Flight is: " + flightPhase.name());
    }

    public void timeout(int milisec) {
        long end = System.currentTimeMillis() + milisec;
        while (System.currentTimeMillis() < end) {}
    }
}
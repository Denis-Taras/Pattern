package state.droneFlightControl;

import state.droneFlightControl.states.OnTheGroundState;
import state.droneFlightControl.states.interfaces.State;

public class FlightControlSystem {

    private State state;

    public FlightControlSystem() {
        this.state = new OnTheGroundState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void takeOff() {
        state.takeOff(this);
    }

    public void climb(int alt) {
        state.climb(this, alt);
    }
    
    public void descend(int alt) {
        state.descent(this, alt);
    }

    public void land() {
        state.landing(this);
    }

    public void getStatusOfFlight() {
        state.getStatusOfFlight();
    }
}
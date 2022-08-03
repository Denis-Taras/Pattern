package state.droneFlightControl.states;

import state.droneFlightControl.FlightControlSystem;
import state.droneFlightControl.FlightPhase;
import state.droneFlightControl.states.interfaces.LandingState;
import state.droneFlightControl.states.interfaces.State;

public class EnRouteFlightState extends State {

    public EnRouteFlightState(int altitude) {
        super.setLandingGearsExtended(false);
        this.setFlapsExtended(false);
        this.setDroneOnTheGround(false);
        this.setAltitude(altitude);
        this.setFlightPhase(FlightPhase.FLIGHT_PHASE);
        System.out.println("Take off complete");
    }

    @Override
    public void takeOff(FlightControlSystem flightControlSystem) {
        System.out.println();
        System.out.println("The Drone is already taken off");
    }

    @Override
    public void climb(FlightControlSystem flightControlSystem, int altitude) {
        this.getStatusOfFlight();

        for(int i = 0; i < 8; i++) {
            this.timeout(1000);
            System.out.print(".");
        }

        System.out.println("Climbing");
        this.setAltitude(altitude);
        this.getStatusOfFlight();
    }

    @Override
    public void descent(FlightControlSystem flightControlSystem, int altitude) {
        this.getStatusOfFlight();

        for(int i = 0; i < 8; i++) {
            this.timeout(1000);
            System.out.print(".");
        }

        System.out.println("Descending");
        this.setAltitude(altitude);
        this.getStatusOfFlight();
    }

    @Override
    public void landing(FlightControlSystem flightControlSystem) {
        if(this.getAltitude() != 3000) {
            this.getStatusOfFlight();
            System.out.println();
            System.out.println("Wrong altitude to enter the glide path. You need to reach altitude 3000ft.");
        } else {
            this.getStatusOfFlight();

            for(int i = 0; i < 8; i++) {
                this.timeout(1000);
                System.out.print(".");
            }

            System.out.println();
            System.out.print("Going to land");
            for(int i = 0; i < 5; i++) {
                this.timeout(1000);
                System.out.print(".");
            }
            System.out.println(".");
            flightControlSystem.setState(new LandingState());
        }
    }
}

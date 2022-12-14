package bridge.fuelStation;

import bridge.fuelStation.Cars.Vehicle;
import bridge.fuelStation.fillingDispensers.StandardDispenser;
import bridge.fuelStation.fillingDispensers.TruckDispenser;
import bridge.fuelStation.fillingDispensers.interfaces.iFillingDispenser;

public class Main {

    public static void main(String[] args) {
        iFillingDispenser standardDispenser = new StandardDispenser();
        iFillingDispenser truckDispenser = new TruckDispenser();

        /*standardDispenser.refuel("Petrol", Vehicle.PASSENGER_CAR);
        standardDispenser.refuel("Diesel", Vehicle.TRUCK);
        standardDispenser.refuel("Gas", Vehicle.BUS);*/

        System.out.println();

        truckDispenser.refuel("Petrol", Vehicle.PASSENGER_CAR);
        truckDispenser.refuel("Diesel", Vehicle.PASSENGER_CAR);
        truckDispenser.refuel("Diesel", Vehicle.TRUCK);
        truckDispenser.refuel("Diesel", Vehicle.BUS);
    }
}

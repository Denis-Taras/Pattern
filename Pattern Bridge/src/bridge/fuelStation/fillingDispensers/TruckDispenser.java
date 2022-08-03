package bridge.fuelStation.fillingDispensers;

import bridge.fuelStation.Cars.Vehicle;
import bridge.fuelStation.fillingDispensers.interfaces.iFillingDispenser;
import bridge.fuelStation.fuels.Diesel;

public class TruckDispenser extends iFillingDispenser {

    @Override
    protected boolean isCorrectVehicle(Vehicle vehicle) {
        if(vehicle.equals(Vehicle.TRUCK) || vehicle.equals(Vehicle.BUS)) return true;
        return false;
    }

    @Override
    public void refuel(String fuelName, Vehicle vehicle) {
        if (fuelName.equals("Diesel")) {
            fuel = new Diesel();
            if (isCorrectVehicle(vehicle)) System.out.println(vehicle + " is refueling by " + fuel.fuelType());
            else System.out.println("Please, change the filling dispenser to correct type");
        } else {
            System.out.println("This dispenser contains only Diesel");
        }
    }
}

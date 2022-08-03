package bridge.fuelStation.fillingDispensers.interfaces;

import bridge.fuelStation.Cars.Vehicle;
import bridge.fuelStation.fuels.interfaces.iFuel;

public abstract class iFillingDispenser {
    protected iFuel fuel;

    protected abstract boolean isCorrectVehicle(Vehicle vehicle);

    public abstract void refuel(String fuel, Vehicle vehicle);
}

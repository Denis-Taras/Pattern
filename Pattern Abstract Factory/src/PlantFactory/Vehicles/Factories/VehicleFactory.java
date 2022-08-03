package PlantFactory.Vehicles.Factories;

import PlantFactory.Vehicles.Vehicle;
import PlantFactory.Vehicles.Wheels.GearType;

public interface VehicleFactory {
    Vehicle createVehicle(GearType gearType);
}

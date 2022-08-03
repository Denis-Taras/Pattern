package PlantFactory.Vehicles.Factories.GearFactories;

import PlantFactory.Vehicles.Wheels.Abstractions.Gear;
import PlantFactory.Vehicles.Wheels.GearType;

public interface GearFactory {
    Gear createWheelGear();
    Gear createCatGear();
}

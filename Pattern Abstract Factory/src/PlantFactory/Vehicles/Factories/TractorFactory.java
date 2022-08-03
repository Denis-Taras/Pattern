package PlantFactory.Vehicles.Factories;

import PlantFactory.Vehicles.Factories.GearFactories.GearFactory;
import PlantFactory.Vehicles.Factories.GearFactories.TractorGearFactory;
import PlantFactory.Vehicles.Tractor;
import PlantFactory.Vehicles.Vehicle;
import PlantFactory.Vehicles.Wheels.Abstractions.Gear;
import PlantFactory.Vehicles.Wheels.GearType;

public class TractorFactory implements VehicleFactory{

    GearFactory gearFactory = new TractorGearFactory();

    @Override
    public Vehicle createVehicle(GearType gearType) {
        Tractor tractor = new Tractor();
        Gear gear = null;
        switch (gearType) {
            case CATERPILLAR -> gear = gearFactory.createCatGear();
            case WHEEL -> gear = gearFactory.createWheelGear();
        }
        tractor.setGear(gear);
        return tractor;
    }
}

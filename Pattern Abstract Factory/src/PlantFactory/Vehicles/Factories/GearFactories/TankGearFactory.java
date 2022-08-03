package PlantFactory.Vehicles.Factories.GearFactories;

import PlantFactory.Vehicles.Wheels.Abstractions.Gear;
import PlantFactory.Vehicles.Wheels.TankCaterpillar;

public class TankGearFactory implements GearFactory {

    @Override
    public Gear createWheelGear() {
        return null;
    }

    @Override
    public Gear createCatGear() {
        return new TankCaterpillar();
    }
}

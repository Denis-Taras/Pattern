package PlantFactory.Vehicles.Factories.GearFactories;

import PlantFactory.Vehicles.Wheels.Abstractions.Gear;
import PlantFactory.Vehicles.Wheels.TractorCaterpillar;
import PlantFactory.Vehicles.Wheels.TractorWheel;

public class TractorGearFactory implements GearFactory{

    @Override
    public Gear createWheelGear() {
        return new TractorWheel();
    }

    @Override
    public Gear createCatGear() {
        return new TractorCaterpillar();
    }
}

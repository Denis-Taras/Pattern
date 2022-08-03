package PlantFactory.Vehicles.Factories;

import PlantFactory.Exceptions.VehicleConstructException;
import PlantFactory.Vehicles.Factories.GearFactories.GearFactory;
import PlantFactory.Vehicles.Factories.GearFactories.TankGearFactory;
import PlantFactory.Vehicles.Tank;
import PlantFactory.Vehicles.Vehicle;
import PlantFactory.Vehicles.Wheels.Abstractions.Gear;
import PlantFactory.Vehicles.Wheels.GearType;

public class TankFactory implements VehicleFactory{

    GearFactory gearFactory = new TankGearFactory();

    @Override
    public Vehicle createVehicle(GearType gearType) {
        Tank tank = new Tank();
        Gear gear = null;
        switch (gearType) {
            case CATERPILLAR -> gear = gearFactory.createCatGear();
            case WHEEL -> gear = gearFactory.createWheelGear();
        }
        if(gear == null) {
            throw new VehicleConstructException("Can not construct tank with this kind of gears!");
        }
        tank.setGear(gear);
        return tank;
    }
}

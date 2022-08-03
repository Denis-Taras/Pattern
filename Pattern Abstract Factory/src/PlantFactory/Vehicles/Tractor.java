package PlantFactory.Vehicles;

import PlantFactory.Vehicles.Wheels.Abstractions.Gear;

public class Tractor implements Vehicle {
    Gear gear;

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "gear=" + gear +
                '}';
    }
}

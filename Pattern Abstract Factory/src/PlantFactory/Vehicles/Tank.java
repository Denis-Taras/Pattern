package PlantFactory.Vehicles;

import PlantFactory.Vehicles.Wheels.Abstractions.Gear;

public class Tank implements Vehicle {
    Gear gear;

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "gear=" + gear +
                '}';
    }
}

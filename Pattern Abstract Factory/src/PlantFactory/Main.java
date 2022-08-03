package PlantFactory;

import PlantFactory.Vehicles.Factories.TankFactory;
import PlantFactory.Vehicles.Factories.TractorFactory;
import PlantFactory.Vehicles.Factories.VehicleFactory;
import PlantFactory.Vehicles.Tank;
import PlantFactory.Vehicles.Tractor;
import PlantFactory.Vehicles.Wheels.GearType;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vehicle Plant");

        VehicleFactory tankFactory = new TankFactory();
        VehicleFactory tractorFactory = new TractorFactory();

        //Tank catTank = (Tank) tankFactory.createVehicle(GearType.CATERPILLAR);
        //Tank wheelTank = (Tank) tankFactory.createVehicle(GearType.WHEEL);
       Tractor wheelTractor = (Tractor) tractorFactory.createVehicle(GearType.WHEEL);
        //Tractor catTractor = (Tractor) tractorFactory.createVehicle(GearType.CATERPILLAR);*/

        //System.out.println(catTank);
        //System.out.println(wheelTank);
        //System.out.println(catTractor);
        System.out.println(wheelTractor);
    }
}

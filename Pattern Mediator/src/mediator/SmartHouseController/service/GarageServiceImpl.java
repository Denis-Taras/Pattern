package mediator.SmartHouseController.service;

import mediator.SmartHouseController.model.Garage;
import mediator.SmartHouseController.model.Status;
import mediator.SmartHouseController.service.interfaces.SmartHouseServiceInterface;

public class GarageServiceImpl implements SmartHouseServiceInterface {

    private Garage garage;

    public GarageServiceImpl(Garage garage) {
        this.garage = garage;
    }
    
    @Override
    public Status checkStatus() {
        return garage.getStatus();
    }

    @Override
    public void heatUp() {
        Status status = garage.getStatus();
        garage.setStatus(status.next());
        System.out.println("Temperature of garage was heated to " + garage.getStatus().name() + " status.");
    }

    @Override
    public void coolDown() {
        Status status = garage.getStatus();
        garage.setStatus(status.previous());
        System.out.println("Temperature of garage was cooled to " + garage.getStatus().name() + " status.");
    }
}
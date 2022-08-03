package mediator.SmartHouseController.service;

import mediator.SmartHouseController.model.Status;
import mediator.SmartHouseController.model.Bedroom;
import mediator.SmartHouseController.service.interfaces.SmartHouseServiceInterface;

public class BedroomServiceImpl implements SmartHouseServiceInterface {

    private Bedroom bedroom;

    public BedroomServiceImpl(Bedroom bedroom) {
        this.bedroom = bedroom;
    }
    
    @Override
    public Status checkStatus() {
        return bedroom.getStatus();
    }

    @Override
    public void heatUp() {
        Status status = bedroom.getStatus();
        bedroom.setStatus(status.next());
        System.out.println("Temperature of bedroom was heated to " + bedroom.getStatus().name() + " status.");
    }

    @Override
    public void coolDown() {
        Status status = bedroom.getStatus();
        bedroom.setStatus(status.previous());
        System.out.println("Temperature of bedroom was cooled to " + bedroom.getStatus().name() + " status.");
    }
}
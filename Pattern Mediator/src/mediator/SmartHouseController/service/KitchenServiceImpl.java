package mediator.SmartHouseController.service;

import mediator.SmartHouseController.model.Status;
import mediator.SmartHouseController.model.Kitchen;
import mediator.SmartHouseController.service.interfaces.SmartHouseServiceInterface;

public class KitchenServiceImpl implements SmartHouseServiceInterface {
    private Kitchen kitchen;

    public KitchenServiceImpl(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public Status checkStatus() {
        return kitchen.getStatus();
    }

    @Override
    public void heatUp() {
        Status status = kitchen.getStatus();
        kitchen.setStatus(status.next());
        System.out.println("Temperature of kitchen was heated to " + kitchen.getStatus().name() + " status.");
    }

    @Override
    public void coolDown() {
        Status status = kitchen.getStatus();
        kitchen.setStatus(status.previous());
        System.out.println("Temperature of kitchen was cooled to " + kitchen.getStatus().name() + " status.");
    }
}
package mediator.SmartHouseController.service.interfaces;

import mediator.SmartHouseController.model.Status;

public interface SmartHouseServiceInterface {
    
    Status checkStatus();
    void heatUp();
    void coolDown();
}

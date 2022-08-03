package mediator.SmartHouseController.controllers;

import mediator.SmartHouseController.model.Bedroom;
import mediator.SmartHouseController.model.Garage;
import mediator.SmartHouseController.model.Kitchen;
import mediator.SmartHouseController.model.Status;
import mediator.SmartHouseController.service.BedroomServiceImpl;
import mediator.SmartHouseController.service.GarageServiceImpl;
import mediator.SmartHouseController.service.KitchenServiceImpl;
import mediator.SmartHouseController.service.TemperatureService;
import mediator.SmartHouseController.service.interfaces.SmartHouseServiceInterface;

public class Mediator {

    private final SmartHouseServiceInterface bedroomService;
    private final SmartHouseServiceInterface garageService;
    private final SmartHouseServiceInterface kitchenService;

    private TemperatureService temperatureService;

    public Mediator(Bedroom bedroom, Garage garage, Kitchen kitchen) {
        this.bedroomService = new BedroomServiceImpl(bedroom);
        this.garageService = new GarageServiceImpl(garage);
        this.kitchenService = new KitchenServiceImpl(kitchen);
        this.temperatureService = new TemperatureService();
    }

    void manageTemperature(int objectNumber) {
        switch (objectNumber) {
            case 1: {
                if(bedroomService.checkStatus().equals(Status.COMFORT)){
                    System.out.println("Bedroom temperature is comfort");
                    return;
                } else if (bedroomService.checkStatus().equals(Status.COLD) || bedroomService.checkStatus().equals(Status.WARM)) {
                    bedroomService.heatUp();
                    this.manageTemperature(1);
                } else if (bedroomService.checkStatus().equals(Status.HOT) || bedroomService.checkStatus().equals(Status.BURN_BABY_BURN)) {
                    bedroomService.coolDown();
                    this.manageTemperature(1);
                }
                break;
            }
            case 2: {
                if(garageService.checkStatus().equals(Status.COMFORT)){
                    System.out.println("Garage temperature is comfort");
                    return;
                } else if (garageService.checkStatus().equals(Status.COLD) || garageService.checkStatus().equals(Status.WARM)) {
                    garageService.heatUp();
                    this.manageTemperature(2);
                } else if (garageService.checkStatus().equals(Status.HOT) || garageService.checkStatus().equals(Status.BURN_BABY_BURN)) {
                    garageService.coolDown();
                    this.manageTemperature(2);
                }
                break;
            }
            case 3: {
                if(kitchenService.checkStatus().equals(Status.COMFORT)){
                    System.out.println("Kitchen temperature is comfort");
                    return;
                } else if (kitchenService.checkStatus().equals(Status.COLD) || kitchenService.checkStatus().equals(Status.WARM)) {
                    kitchenService.heatUp();
                    this.manageTemperature(3);
                } else if (kitchenService.checkStatus().equals(Status.HOT) || kitchenService.checkStatus().equals(Status.BURN_BABY_BURN)) {
                    kitchenService.coolDown();
                    this.manageTemperature(3);
                }
                break;
            }
            case 0: {
                this.manageTemperature(1);
                this.manageTemperature(2);
                this.manageTemperature(3);
                break;
            }
            default:
                System.out.println("Object not connected");
        }
    }

    public void checkOutsideStatus() {
        System.out.println("Temperature outside is " + temperatureService.getOutsideTemperatureStatus().name());
    }

}
package mediator.SmartHouseController.service;

import mediator.SmartHouseController.model.Status;

import java.io.IOException;
import java.time.LocalTime;

public class TemperatureService {

    private WebService webService;

    public TemperatureService() {
        try {
            this.webService = new WebService();
        } catch (IOException ex) {
            System.out.println("Unable to get web service.");
        }
    }
    private boolean isNight() {
        LocalTime localTime = LocalTime.now();
        return localTime.getHour() > 22 || localTime.getHour() < 7;
    }

    public Status getOutsideTemperatureStatus() {
        int temperature;
        Status currentStatus = Status.COLD;
        try {
            if(isNight()) {
                temperature = webService.getForecastNighttimeTemperature();
                if (temperature <= 15) {
                    currentStatus = Status.COLD;
                } else if(temperature > 15 && temperature <= 18) {
                    currentStatus = Status.WARM;
                } else if(temperature > 18 && temperature <= 22) {
                    currentStatus = Status.COMFORT;
                } else if(temperature > 22 && temperature <= 26) {
                    currentStatus = Status.HOT;
                } else if(temperature > 26) {
                    currentStatus = Status.BURN_BABY_BURN;
                }
            } else {
                temperature = webService.getForecastDaytimeTemperature();
                if (temperature <= 17) {
                    currentStatus = Status.COLD;
                } else if(temperature > 17 && temperature <= 20) {
                    currentStatus = Status.WARM;
                } else if(temperature > 20 && temperature <= 24) {
                    currentStatus = Status.COMFORT;
                } else if(temperature > 24 && temperature <= 28) {
                    currentStatus = Status.HOT;
                } else if(temperature > 28) {
                    currentStatus = Status.BURN_BABY_BURN;
                }
            }
        } catch (IOException ex) {
            System.out.println("Unable to start system. No connection to the internet");
        }
        return currentStatus;
    }
}

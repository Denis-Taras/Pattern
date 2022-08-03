package bridge.fuelStation.fuels;

import bridge.fuelStation.fuels.interfaces.iFuel;

public class Petrol implements iFuel {
    @Override
    public String fuelType() {
        return "Petrol";
    }
}

package bridge.fuelStation.fuels;

import bridge.fuelStation.fuels.interfaces.iFuel;

public class Diesel implements iFuel {
    @Override
    public String fuelType() {
        return "Diesel";
    }
}

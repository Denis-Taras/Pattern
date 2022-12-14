package train.carriages;

import train.astractions.CarriageModule;
import train.astractions.RailwayCarriage;
import train.modules.LuxSleepingModule;

import java.io.Serializable;

public class LuxSleepingCarriage extends RailwayCarriage implements Serializable {

    public LuxSleepingCarriage() {
        super();
        this.setModules();
    }

    public LuxSleepingCarriage(RailwayCarriage targetCarriage) {
        super(targetCarriage);
        this.setModules();
    }

    private void setModules() {
        CarriageModule module = new LuxSleepingModule();
        for(int i = 0; i < this.getModuleCapacity(); i++) {
            this.getModuleArray()[i] = module.getClone();
        }
    }

    @Override
    public RailwayCarriage getClone() {
        return new LuxSleepingCarriage(this);
    }
}

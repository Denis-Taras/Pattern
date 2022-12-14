package train.carriages;

import train.astractions.CarriageModule;
import train.astractions.RailwayCarriage;
import train.modules.SleepingModule;

public class SleepingCarriage extends RailwayCarriage implements Cloneable{

    public SleepingCarriage() {
        super();
        this.setModules();
    }

    public SleepingCarriage(RailwayCarriage targetCarriage) {
        super(targetCarriage);
        this.setModules();
    }

    private void setModules() {
        CarriageModule module = new SleepingModule();
        for(int i = 0; i < this.getModuleCapacity(); i++) {
            this.getModuleArray()[i] = module.getClone();
        }
    }

    @Override
    public RailwayCarriage clone() {
        return new SleepingCarriage(this);
    }

    @Override
    public RailwayCarriage getClone() {
        return new SleepingCarriage(this);
    }
}

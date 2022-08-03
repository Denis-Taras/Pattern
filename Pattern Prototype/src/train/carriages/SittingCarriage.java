package train.carriages;

import train.astractions.CarriageModule;
import train.astractions.RailwayCarriage;
import train.modules.SittingModule;

public class SittingCarriage extends RailwayCarriage {

    public SittingCarriage() {
        super();
        this.setModules();
    }

    public SittingCarriage(int floorQuantity) {
        super(floorQuantity);
        this.setModules();
    }

    public SittingCarriage(RailwayCarriage targetCarriage) {
        super(targetCarriage);
        this.setModules();
    }

    private void setModules() {
        CarriageModule module = new SittingModule();
        for(int i = 0; i < this.getModuleCapacity(); i++) {
            this.getModuleArray()[i] = module.getClone();
        }
    }

    @Override
    public RailwayCarriage getClone() {
        return new SittingCarriage(this);
    }
}

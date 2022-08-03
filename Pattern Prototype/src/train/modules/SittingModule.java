package train.modules;

import train.astractions.CarriageModule;

public class SittingModule extends CarriageModule {

    public SittingModule() {
        super(6);
    }

    public SittingModule(CarriageModule resourceModule) {
        super(resourceModule);
    }

    @Override
    public CarriageModule getClone() {
        return new SittingModule(this);
    }
}

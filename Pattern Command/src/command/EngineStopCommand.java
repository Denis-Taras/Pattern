package command;

public class EngineStopCommand implements Command{

    private StandardEngineStartStopProcedures engineProcedures;

    public EngineStopCommand(StandardEngineStartStopProcedures engineProcedures) {
        this.engineProcedures = engineProcedures;
    }

    @Override
    public boolean execute() {
        engineProcedures.plugOutGenerator();
        engineProcedures.fuelSupplyOff();
        engineProcedures.hydraulicSystemOff();
        engineProcedures.airSupplyOff();
        engineProcedures.stopAPU();
        engineProcedures.turnOffBatteryPower();
        return engineProcedures.isEngineStarted();
    }
}

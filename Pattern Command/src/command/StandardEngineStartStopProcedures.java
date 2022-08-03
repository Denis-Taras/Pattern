package command;

public class StandardEngineStartStopProcedures {

    private boolean isBatteryPlugged;
    private boolean isAPUActive;
    private boolean isAirSupplying;
    private boolean isHydraulicSystemOn;
    private boolean isFuelSupplying;
    private boolean isEngineStarted;
    private boolean isGeneratorPlugged;

    public StandardEngineStartStopProcedures() {
        this.isBatteryPlugged = false;
        this.isAPUActive = false;
        this.isAirSupplying = false;
        this.isHydraulicSystemOn = false;
        this.isFuelSupplying = false;
        this.isEngineStarted = false;
        this.isGeneratorPlugged = false;
    }

    public void turnOnBatteryPower() {
        if(!isBatteryPlugged) isBatteryPlugged = true;
        System.out.println("Systems is supplying with power from battery");
    }
    public void turnOffBatteryPower() {
        isBatteryPlugged = false;
        System.out.println("Supplying systems with power from battery is cut off");
    }

    public void startAPU() {
        if(isBatteryPlugged) {
            isAPUActive = true;
            System.out.println("APU is started. Aircraft is supplying with power from APU");
        } else {
            System.out.println("No power from battery. Roll back and try again");
        }
    }
    public void stopAPU() {
        isAPUActive = false;
        System.out.println("APU is STOPPED. Supplying aircraft with power from APU is cut off");
    }

    public void airSupplyOn() {
        if(isAPUActive) {
            isAirSupplying = true;
            System.out.println("Engine is supplying with air");
        } else {
            System.out.println("APU is not active. Roll back and try again");
        }
    }
    public void airSupplyOff() {
        isAirSupplying = false;
        System.out.println("Supplying engine with air is cut off");
    }

    public void hydraulicSystemOn() {
        if(isAPUActive) {
            if(isAirSupplying) {
                isHydraulicSystemOn = true;
                System.out.println("Hydraulic system ON");
            } else {
                System.out.println("No air pressure. Roll back and try again");
            }
        } else {
            System.out.println("APU is not active. Roll back and try again");
        }
    }
    public void hydraulicSystemOff() {
        isHydraulicSystemOn = false;
        System.out.println("Hydraulic system OFF");
    }

    public void fuelSupplyOn() {
        if(isHydraulicSystemOn) {
            if(isAPUActive) {
                if(isAirSupplying) {
                    isFuelSupplying = true;
                    isEngineStarted = true;
                    System.out.println("Supplying engine with fuel. ENGINE STARTED!");
                } else {
                    System.out.println("No air pressure. Roll back and try again");
                }
            } else {
                System.out.println("APU is not active. Roll back and try again");
            }
        } else {
            System.out.println("Hydraulic system is not active");
        }
    }
    public void fuelSupplyOff() {
        isFuelSupplying = false;
        isEngineStarted = false;
        System.out.println("Supplying engine with fuel is cut off. ENGINE STOPPED!");
    }

    public void plugOnGenerator() {
        if(isEngineStarted) {
            isGeneratorPlugged = true;
            isBatteryPlugged = false;
            isAPUActive = false;
            System.out.println("Generator is plugged on. ---[Battery is plugged out. APU is stopped]---");
        } else {
            System.out.println("Engine is stopped. Roll back and try again");
        }
    }
    public void plugOutGenerator() {
        isGeneratorPlugged = false;
        System.out.println("Generator is plugged out.");
    }

    public boolean isEngineStarted() {
        return isEngineStarted;
    }
}

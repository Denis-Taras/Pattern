package command;

public class EngineController {

    private EngineStartCommand startCommand;
    private EngineStopCommand stopCommand;
    private BlackBox blackBox;

    public EngineController(EngineStartCommand startCommand,
                            EngineStopCommand stopCommand,
                            BlackBox blackBox) {
        this.startCommand = startCommand;
        this.stopCommand = stopCommand;
        this.blackBox = blackBox;
    }

    public void startEngine() {
        if(startCommand.execute()) blackBox.push(startCommand);
    }

    public void stopEngine() {
        if(!stopCommand.execute()) blackBox.push(stopCommand);
    }
}

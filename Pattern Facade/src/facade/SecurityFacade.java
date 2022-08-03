package facade;

public class SecurityFacade {
    DoorLock doorLock = new DoorLock();
    WindowLock windowLock = new WindowLock();
    HallMovementDetector hallMovementDetector = new HallMovementDetector();
    KitchenMovementDetector kitchenMovementDetector = new KitchenMovementDetector();
    RoomMovementDetector roomMovementDetector = new RoomMovementDetector();

    void allOn() {
        doorLock.on();
        windowLock.on();
        hallMovementDetector.on();
        kitchenMovementDetector.on();
        roomMovementDetector.on();
    }
    
    void allOff() {
        doorLock.off();
        windowLock.off();
        hallMovementDetector.off();
        kitchenMovementDetector.off();
        roomMovementDetector.off();
    }

    void getStatus() {
        System.out.println("Is Door locked: " + doorLock.getStatus());
        System.out.println("Is Window locked: " + windowLock.getStatus());
        System.out.println("Is Hall secured: " + hallMovementDetector.isTurnedOn());
        System.out.println("Sensitivity of Hall detector: " + hallMovementDetector.getSensitivity());
        System.out.println("Is Kitchen locked: " + kitchenMovementDetector.isTurnedOn());
        System.out.println("Sensitivity of Kitchen detector: " + kitchenMovementDetector.getSensitivity());
        System.out.println("Is Room locked: " + roomMovementDetector.isTurnedOn());
        System.out.println("Sensitivity of Room detector: " + roomMovementDetector.getSensitivity());
    }
}
package facade;

public interface MovementDetector {
    int sensitivity = 40;
    
    void on();
    void off();
    void adjustSensitivity(int sensitivity);
}

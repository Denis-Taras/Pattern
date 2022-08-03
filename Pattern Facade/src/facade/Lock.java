package facade;

public interface Lock {
    void on();
    void off();
    boolean getStatus();
}

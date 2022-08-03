import model.Aircraft;
import model.Boeing737;
import model.Iron;
import model.SimpleDevice;

public class Main {
    
    public static void main(String[] args) {
        /*SimpleDevice iron = new Iron();
        iron.turnOn();
        iron.warmUp();
        iron.turnOff();*/
        Aircraft aircraft = new Boeing737();

        SimpleDevice ironAdapter = new IronAdapter(aircraft);

        ironAdapter.turnOn();
        //ironAdapter.turnOff();
        ironAdapter.warmUp();
    }
}

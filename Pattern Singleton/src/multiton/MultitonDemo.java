package multiton;

public class MultitonDemo {
    
    public static void main(String[] args) {
        Check.get(Level.JUNIOR);
        Check.get(Level.MIDDLE);
        Check.get(Level.MIDDLE);
        Check.get(Level.MIDDLE);
        Check.get(Level.MIDDLE);
        Check.get(Level.SENIOR);
    }
}

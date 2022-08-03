package basicsingleton;

import java.io.Serializable;

public class Singleton implements Serializable{
    private static volatile Singleton instance;
    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) synchronized(Singleton.class){
            instance = new Singleton();
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
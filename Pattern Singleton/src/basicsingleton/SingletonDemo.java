package basicsingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonDemo {

    static void saveToFile(Singleton singleton, String filename) throws Exception {
        try (FileOutputStream outFile = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(outFile)) {
            out.writeObject(singleton);
        }
    }

    static Singleton readFromFile(String filename)
        throws Exception {
        try (FileInputStream inFile = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(inFile)) {
            return (Singleton) in.readObject();
        }
    }

    public static void main(String[] args) throws Exception
    {
        Singleton singleton = Singleton.getInstance();
        singleton.setValue(22);

        /*Singleton singleton2 = Singleton.getInstance();
        singleton.setValue(19);*/
        String filename = "sngltn.bin";
        saveToFile(singleton, filename);

        singleton.setValue(19);
        
        Singleton singleton2 = readFromFile(filename);
        
        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());
        System.out.println(singleton == singleton2);
    }

}

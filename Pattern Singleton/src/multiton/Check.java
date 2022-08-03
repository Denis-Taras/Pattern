package multiton;

import java.util.HashMap;

public class Check {

    private static int count = 0;

    private Check() {
        count++;
        System.out.println("instances created: " + count);
    }

    private static HashMap<Level, Check> instances = new HashMap<>();

    public static Check get(Level level) {
        if (instances.containsKey(level)) {
            return instances.get(level);
        }

        Check instance = new Check();
        instances.put(level, instance);
        return instance;
    }
}
package enumsingleton;

public enum EnumSingleton {
    
    INSTANCE;

    EnumSingleton() {
        value = 14;
    }
    
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}


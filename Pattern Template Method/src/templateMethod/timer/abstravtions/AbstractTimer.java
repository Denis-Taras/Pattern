package templateMethod.timer.abstravtions;

public abstract class AbstractTimer {

    public void timeout(int delay) {
        long end = System.currentTimeMillis() + delay;
        while (System.currentTimeMillis() < end) {}
    }

    public abstract void startTimer(int delayTime);
    public abstract void inform();
}

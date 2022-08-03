package templateMethod.timer.algorithms;

import templateMethod.timer.abstravtions.AbstractTimer;

public class KitchenTimer extends AbstractTimer {

    @Override
    public void startTimer(int delayTime) {
        for(; delayTime >= 0; delayTime--) {
            if(delayTime > 4) {
                System.out.print("*");
                super.timeout(1000);
            } else if(delayTime == 4) {
                System.out.println("*");
                super.timeout(1000);
            } else if (delayTime <= 3 && delayTime > 0) {
                System.out.print(delayTime);
                super.timeout(1000);
                System.out.print("\b");
            } else {
                this.inform();
            }
        }
    }

    @Override
    public void inform() {
        System.out.println("Alarm!!!");
        super.timeout(500);
        System.out.println("Alarm!!!");
        super.timeout(500);
        System.out.println("Alarm!!!");
    }

}
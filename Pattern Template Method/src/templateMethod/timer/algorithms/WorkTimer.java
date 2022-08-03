package templateMethod.timer.algorithms;

import templateMethod.timer.abstravtions.AbstractTimer;

public class WorkTimer extends AbstractTimer {

    @Override
    public void startTimer(int workTime) {
        for(int i = 0; i <= workTime; i++) {
            if(i < workTime-2) {
                System.out.print("*");
                super.timeout(1000);
            } else if(i == workTime-2) {
                System.out.println("*");
                super.timeout(1000);
            } else if (i == workTime-1) {
                String message = "1 hour remains! Finish your job and get ready to go home!";
                System.out.print(message);
                super.timeout(4000);
                for(int j = message.length(); j > 0; j--) {
                    super.timeout(50);
                    System.out.print("\b");
                }
            } else {
                this.inform();
            }
        }
    }

    @Override
    public void inform() {
        System.out.println("Time to go home!!!");
    }
}

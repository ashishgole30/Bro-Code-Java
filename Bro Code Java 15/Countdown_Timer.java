import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Countdown_Timer {
    public static void main(String[] args) {

        // Java Countdown timer program

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seconds to countdown from:");
        int respone = scanner.nextInt();

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int count = respone;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count < 0) {
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1, 1000); // (task/delay/period)
        scanner.close();
    }
}
import java.util.Scanner;

public class ForLoop3 {
    public static void main(String[] args) throws InterruptedException {

        // MINI PROJECT COUNTDOWN TIMER
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many second to countdown from:");

        int start = scanner.nextInt();
        // i behaves as if its equal to start

        for (int i = start; i > 0; i--) {
            System.out.println(i);

            // Using Thread Class
            // using Thread.sleep method to pause for 1 second
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year!");
        scanner.close();
    }
}

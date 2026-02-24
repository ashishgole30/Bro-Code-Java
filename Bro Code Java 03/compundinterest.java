
// import scanner
import java.util.Scanner;

public class compundinterest {
    public static void main(String[] args) {

        // Compound Interest Calculator

        // Scanner Object

        Scanner scanner = new Scanner(System.in);

        // Declare Variables

        double prinicipalamount;
        double rateofinterest;
        int timeinyears;
        int nTimesCompounded;
        double finalamount;

        // Accept user input
        System.out.print("Enter Prinicipal Amount:");
        prinicipalamount = scanner.nextDouble();

        System.out.print("Enter Rate Of Interest (in %):");
        rateofinterest = scanner.nextDouble() / 100;

        System.out.print("Enter Number Of Years:");
        timeinyears = scanner.nextInt();

        System.out.print("Enter Number Of Times Compounded:");
        nTimesCompounded = scanner.nextInt();

        // Compound Interest Formula

        finalamount = prinicipalamount
                * Math.pow(1 + rateofinterest / nTimesCompounded, nTimesCompounded * timeinyears);

        // Display Final Output

        System.out.printf("The amount after %d years is $%.2f", timeinyears, finalamount);
        // close scanner

        scanner.close();

    }

}

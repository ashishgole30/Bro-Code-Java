
// Java banking program
// Import Scanner Class
import java.util.Scanner;

// class banking program
public class BankingProgram {

    // Scanner Object
    static Scanner scanner = new Scanner(System.in);

    // Main method
    public static void main(String[] args) {

        // declare variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            // display menu
            System.out.println("********");
            System.out.println("Banking Program");
            System.out.println("********");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. EXIT");
            System.out.println("********");
            // get and process users choice
            System.out.print("Enter Your Choice (1-4):");
            choice = scanner.nextInt();

            // switch case for user choice
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                // EXIT
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }

        }
        // Exit message
        System.out.println("Thank you for using the banking program. Goodbye!");
        // Scanner Object Closed
        scanner.close();
    }

    // showbalance method
    static void showBalance(double balance) {
        System.out.println("*******************");
        System.out.printf("$%.2f\n", balance);
    }

    // deposit method
    static double deposit() {
        double amount;
        System.out.print("Enter an amount to be deposited:");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cant be negative");
            return 0;
        } else {
            return amount;
        }

    }

    // withdraw method
    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter amount to be withdrawn:");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficent Funds");
            return 0;

        } else if (amount < 0) {
            System.out.println("Amount Cant Be Negative");
            return 0;
        } else {
            return amount;
        }

    }
}

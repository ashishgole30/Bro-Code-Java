import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTwo {
    public static void main(String[] args) {

        // Exception = An even that interrupts the normal flow of a program
        // (Dividing by zero , file not found , mismatch input type)
        // Surround any dangerous code with a try{} block
        // try{} , catch {} , finally{}

        // Better to catch specific exceptions
        // And letting user know what went wrong

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter A Number:");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("That wasn't a Number");
        } catch (ArithmeticException e) {
            System.out.println("YOU CANT DIVIDE BY ZERO!");
        }

        // You can catch all exceptions
        // as follows
        catch (Exception e) {
            // SAFETY NET
            System.out.println("Something went wrong");
        }

        // Finally will always execute
        // Oftenly used for cleanup
        finally {
            scanner.close();
            System.out.println("this always executes");
        }
    }
}
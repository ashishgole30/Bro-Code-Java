import java.util.Scanner;

public class Weightconversion {
    public static void main(String[] args) {
        // weight conversion program

        // declare variables

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int option;

        // welcome message
        System.out.println("Welcome to the Weight Conversion Program!");
        System.out.println("1. Convert pounds (lbs) to kilograms (kgs)");
        System.out.println("2. Convert kilograms (kgs) to pounds (lbs)");
        // prompt user for input
        System.out.print("Choose an option (1 or 2): ");
        option = scanner.nextInt();

        // option 1 convert lbs to kgs
        if (option == 1) { // == comparison operator , = assignment operator
            System.out.print("Enter weight in pounds (lbs): ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Weight in kilograms (kgs): %.2f kg", newWeight);
        }
        // option 2 convert kgs to lbs
        else if (option == 2) {
            System.out.print("Enter weight in kilograms (kgs): ");
            weight = scanner.nextDouble();
            newWeight = weight / 0.453592;
            System.out.printf("Weight in pounds (lbs): %.2f lbs", newWeight);
        }

        // else invalid option
        else {
            System.out.println("Invalid option selected. Please choose 1 or 2.");
        }

        scanner.close();

    }
}

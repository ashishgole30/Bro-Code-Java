import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {

        // Create Scanner
        Scanner scanner = new Scanner(System.in);

        // Declare Variables
        double inputValue;
        double convertedValue;
        int choice;

        // Welcome Message
        System.out.println("Welcome to Temp Conversion Program");

        // Option 1 Celsius to Farhenheit
        System.out.println("1. Convert Celsius to Farenheit");
        // Option 2 Farhenheit to Celsius
        System.out.println("2. Convert Farhenheit to Celsius");
        // User input choice
        System.out.print("Enter Your Choice (1/2):");
        choice = scanner.nextInt();

        // if
        if (choice == 1) {
            System.out.print("Enter Value in Celsius:");
            inputValue = scanner.nextDouble();
            convertedValue = (inputValue * 9 / 5) + 32;
            System.out.printf("The %s value in Farhenheits is  %.2f Farhenhits", inputValue, convertedValue);
        }

        // else if
        else if (choice == 2) {
            System.out.print("Enter Value in Farnheits:");
            inputValue = scanner.nextDouble();
            convertedValue = (inputValue - 32) * 5 / 9;
            System.out.printf("The %s value in Celsius is  %.2f Celsius", inputValue, convertedValue);
        }

        // else
        else {
            System.out.println("Invalid Choice");
        }

        // Scanner close
        scanner.close();
    }
}

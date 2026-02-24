import java.util.Scanner;

public class User_Input_Two {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // However there is one issue when we accept
        // a integer or a double and then a string

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // clearing the input buffer

        // after accepting an integer or a double
        // we need to get rid of new line charcter in the input buffer
        scanner.nextLine(); // <---- USE THIS TO SOLVE ANY ISSUES

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the color " + color);

        scanner.close();

    }
}
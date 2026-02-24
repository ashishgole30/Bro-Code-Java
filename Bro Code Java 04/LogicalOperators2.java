import java.util.Scanner;

public class LogicalOperators2 {

    public static void main(String[] args) {

        // LOGICAL OPERATORS --> Allows us to check or modify more than one condition

        // && = AND (ALL CONDITIONS MUST BE TRUE)
        // || = OR (ATLEAST ONE CONDITION MUST BE TRUE)
        // ! = NOT (OPPOSITE OF WHAT IS GIVEN)

        Scanner scanner = new Scanner(System.in);

        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        String username;

        System.out.print("Enter Your New Username:");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username msut be between 4-12 characters");
        } else if (username.contains("") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores");
        } else {
            System.out.println("Welcome " + username);
        }

        scanner.close();

    }
}

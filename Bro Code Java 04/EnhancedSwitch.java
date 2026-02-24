import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        // Enhanced switch = A replacement to many else if statements

        System.out.print("Enter the day of the week: ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        // Syntax of enhanced switch
        // switch (variable) {
        // case value1, value2 -> statement;
        // case value3 -> {
        // statement1;
        // default -> statement;
        // }

        // -> arrow operator means "then"

        // to ignore case sensitivity
        day = day.toLowerCase();
        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                System.out.println("It is a Weekday T_T ");
            case "saturday", "sunday" ->
                System.out.println("It is a Weekend :p ");

            default -> System.out.println(day + " IS NOT A DAY");

        }

        scanner.close();
    }
}

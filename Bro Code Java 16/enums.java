import java.util.Scanner;

public class enums {
    public static void main(String[] args) {

        // Enums = (Enumerations)
        // A special kind of class that represents a fixed set
        // of constants.
        // They improve code redeability and are easy to maintain.
        // More efficient with switches rather than when comparing strings
        // enum is a special kind of class similar to interfaces
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week:");
        String response = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(response);
            // System.out.println(day);
            // System.out.println(day.getDayNumber());

            switch (day) {
                case MONDAY,
                        TUESDAY,
                        WEDNESDAY,
                        THURSDAY,
                        FRIDAY ->
                    System.out.println("It is a weekday");
                case SATURDAY, SUNDAY -> System.out.println("It is a weekend");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid day");
        }
        scanner.close();
    }
}
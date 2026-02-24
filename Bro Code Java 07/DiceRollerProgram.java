
// DICE ROLLER PROGRAM IN JAVA
import java.util.Random;
import java.util.Scanner;

public class DiceRollerProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("Enter The Number Of Dice To Roll:");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {

            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled:" + roll);
                total = total + roll;
            }
            System.out.println("Total:" + total);
        } else {
            System.out.println("Number Of Dice Must Be Greater Than Zero");
        }

        scanner.close();
    }

    static void printDie(int roll) {
        String dice1 = """
                 -------
                |       |
                |   *   |
                |       |
                 -------
                        """;

        String dice2 = """
                 -------
                | *     |
                |       |
                |     * |
                 -------
                        """;
        String dice3 = """
                 -------
                | *     |
                |   *   |
                |     * |
                 -------
                        """;
        String dice4 = """
                 -------
                | *   * |
                |       |
                | *   * |
                 -------
                        """;
        String dice5 = """
                 -------
                | *   * |
                |   *   |
                | *   * |
                 -------
                        """;
        String dice6 = """
                 -------
                | *   * |
                | *   * |
                | *   * |
                 -------
                        """;

        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.print("INVALID ROLL");
        }
    }
}
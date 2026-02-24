import java.util.Random;
import java.util.Scanner;

public class SlotMachineGame {
    public static void main(String[] args) {

        // JAVA SLOT MACHINE
        // Declare variables
        // display welcome message
        // play if balance is greater than zero
        // enter bet amount
        // a. verify if bet is greater than balance
        // b. verify if bet is greater than zero
        // c. substract bet from balance
        // spin row
        // print row
        // ask to play again
        // display exit message

        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("*************************");
        System.out.println(" Welcome to Java Slots ");
        System.out.println(" Symbols: @ # $ * %");

        while (balance > 0) {
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet > balance) {
                System.out.println("Insufficient Funds");
                continue;
            } else if (bet <= 0) {
                System.out.println("bet must be greater than zero");
                continue;
            } else {
                balance = balance - bet;

            }

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);
            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance = balance + payout;

            } else {
                System.out.println("Sorry, you lost this round");
            }

            System.out.print("Do you want to play again?(Y/N):");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                break;
            }
        }

        System.out.println("GAME OVER! Your final balance is $" + balance);
        scanner.close();
    }

    static String[] spinRow() {

        String[] symbols = { "@", "#", "$", "*", "%" };
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = (symbols[random.nextInt(5)]);
        }
        return row;

    }

    static void printRow(String[] row) {
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }

    static int getPayout(String[] row, int bet) {

        if (row[0].equals(row[1]) && (row[1].equals(row[2]))) {

            return switch (row[0]) {
                case "@" -> bet * 3;
                case "#" -> bet * 4;
                case "$" -> bet * 5;
                case "*" -> bet * 10;
                case "%" -> bet * 20;
                default -> 0;
            };

        } else if (row[0].equals(row[1])) {

            return switch (row[0]) {
                case "@" -> bet * 2;
                case "#" -> bet * 3;
                case "$" -> bet * 4;
                case "*" -> bet * 5;
                case "%" -> bet * 10;
                default -> 0;
            };

        }

        else if (row[1].equals(row[2])) {

            return switch (row[1]) {
                case "@" -> bet * 2;
                case "#" -> bet * 3;
                case "$" -> bet * 4;
                case "*" -> bet * 5;
                case "%" -> bet * 10;
                default -> 0;
            };

        }
        return 0;
    }
}
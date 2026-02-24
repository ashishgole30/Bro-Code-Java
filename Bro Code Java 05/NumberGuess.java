import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 101;

        // range (inclusive, exclusive)
        int randomNumber = random.nextInt(min, max);
        System.out.println("Welcome To Number guess game");
        System.out.printf("Guess a number between %d-%d\n", min, max - 1);

        do {
            System.out.print("Enter a guess:");
            guess = scanner.nextInt();

            // to increment attempts
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " in " + attempts
                        + " attempts.");
            }

        } while (guess != randomNumber);

        scanner.close();
    }
}

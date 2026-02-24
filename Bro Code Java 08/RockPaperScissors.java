import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        // ROCK PAPER SCISSORS GAME

        // Declare Variables
        // Get choice from the user
        // Get random choice from the computer
        // Check win conditions
        // Ask to play again
        // Goodbye message

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter Your move (rock/paper/scissors):");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("Invalid Choice");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer Choice:" + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("ITS A TIE!");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock") ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("YOU WIN!");
            } else {
                System.out.println("YOU LOSE!");
            }

            System.out.print("Play Again? (yes/no):");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        scanner.close();
    }
}

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        // JAVA QUIZ GAME

        // Questions array[]
        // Options array[][]
        // Answers array[]
        // Declare variables
        // Welcome message
        // Question (loop)
        // --options
        // --get guess from user
        // --check out guess
        // Display Final Score

        String[] questions = { "What is the main function of a router?",
                "Which part of the computer is considered as its brain?",
                "What year was facebook launched?",
                "Who is known as the father of computers?",
                "what was the first programming language?" };

        String[][] options = {
                { "1. Storing Files", "2. Encrypting Data", "3. Directing Internet Traffic", "4. Managing passwords" },
                { "1. CPU", "2. RAM", "3. Hard Drive", "4. GPU" },
                { "1. 2000", "2. 2004", "3. 2006", "4. 2008" },
                { "1. Steve Jobs ", "2. Alan Turing", "3. Bill Gates", "4. Charles Babbage" },
                { "1. Assembly Language ", "2. COBOL", "3. Fortran ", "4. C" }

        };

        int[] answers = { 3, 1, 2, 4, 3 };

        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("-------------------------------");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);

            }
            System.out.print("Enter Your Guess:");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("-----------");
                System.out.println("Correct!");
                System.out.println("-----------");
                score++;
            } else {
                System.out.println("-----------");
                System.out.println("Wrong!");
                System.out.println("-----------");

            }
        }
        System.out.println("Your Final Score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}

import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String respose = "";

        while (!respose.equals("Q")) {
            System.out.println("You are Playing a game");
            System.out.print("Press Q to quit:");
            respose = scanner.next().toUpperCase();
        }

        System.out.println("You have quit the game");
        scanner.close();

    }

    {

    }
}

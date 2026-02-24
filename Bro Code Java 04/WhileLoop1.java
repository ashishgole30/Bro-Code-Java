import java.util.Scanner;

public class WhileLoop1 {

    public static void main(String[] args) {

        // while loop = repeat some code forever
        // while some condition remains true

        // SYNTAX OF WHILE LOOP
        // while (condition) {
        // // code block to be executed
        // }

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter Your name:");
            name = scanner.nextLine();

        }

        System.out.println("Hello " + name);

        scanner.close();

    }
}

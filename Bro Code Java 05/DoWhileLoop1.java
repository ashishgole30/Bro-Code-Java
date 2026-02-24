import java.util.Scanner;

public class DoWhileLoop1 {

    // do while loop

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = 0;

        // we do this code first
        // then we check the condition

        // Key difference between while and do while loop is
        // Yo always execute the code block at least once in do while loop

        do {
            System.out.println("Your age cant be negative");
            System.out.print("Enter Your age: ");
            age = scanner.nextInt();
        } while (age < 0);

        System.out.println("You are " + age + " years old");

        scanner.close();

    }
}

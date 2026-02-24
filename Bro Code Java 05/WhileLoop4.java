import java.util.Scanner;

public class WhileLoop4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = 0;

        System.out.print("Enter Your age: ");
        age = scanner.nextInt();

        // we skip the while loop if the age is valid

        while (age < 0) {
            System.out.println("Your age cant be negative");
            System.out.print("Enter Your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old");

        scanner.close();

    }
}

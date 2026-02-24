// scanner is an object that allows us
// to accept input from the user
// In order to use scanner we need to import it from a package

import java.util.Scanner;

public class User_Input_One {

    public static void main(String[] args) {

        // creating scanner object

        Scanner scanner = new Scanner(System.in);
        // name of class // name of object

        // to read a string (nextline OR next)
        // nextline method of our scanner object reads a string of
        // characters including spaces
        // if you dont want any spcaes use next
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        // to read a integer (nextInt)
        System.out.print("Enter Your Age:");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old");

        // to read a decimal number (nextDouble)
        System.out.print("Enter your previous semester's sgpa: ");
        double sgpa = scanner.nextDouble();
        System.out.println("Well done you scored " + sgpa + " last sem");

        // to read a boolean (nextBoolean)
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }
        scanner.close();
    }
}
import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        String place;
        String animal;
        String verb;
        String adjective2;

        System.out.print("Enter Any Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Any Place: ");
        place = scanner.nextLine();
        System.out.print("Enter Any Animal: ");
        animal = scanner.nextLine();
        System.out.print("Enter Any Verb: ");
        verb = scanner.nextLine();
        System.out.print("Enter AnyAdjevctive: ");
        adjective2 = scanner.nextLine();

        System.out.println("Hello My Name is " + name);
        System.out.println("Today I went to a " + place);
        System.out.println("I saw a " + animal);
        System.out.println("The " + animal + " was " + verb);
        System.out.println("It was a " + adjective2 + " day");

        scanner.close();

    }
}
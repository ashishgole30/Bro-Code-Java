import java.util.Scanner;

public class RuntimePolymorphism {
    public static void main(String[] args) {

        // Runtime polymorphism = When the method that gets executed
        // is decided at runtime based on the actual type of the object

        // Parent class is animal class which is abstract class
        // It has a abstract speak method
        // Child classes are dog and cat which extends parent class Animal
        // Child classes override the abstract method of speak

        // Creating animal object but not instantiate it
        Animal animal;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you lile a dog or a cat? ( 1 = dog , 2 = cat) :");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
    }
}

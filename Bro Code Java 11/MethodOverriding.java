public class MethodOverriding {
    public static void main(String[] args) {
        // Method Overriding = When a subclass provides its own
        // implementation of a method that is already defined
        // Allows for code reusability and give specific implementations

        // Animal class is the parent class
        // dog , cat , fish are the child classes of the parent class animal

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();

    }
}
public class Car {

    // these are known as attributes
    // things that an object has
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    // these are known as methods
    // things that an object can do

    void start() {
        isRunning = true;
        System.out.println("Car is starting...");
    }

    void stop() {
        isRunning = false;
        System.out.println("Car is stopping...");
    }

    void drive() {
        System.out.println("You drive the " + model);
    }

    void brake() {
        System.out.println("You brake the " + model);
    }
}
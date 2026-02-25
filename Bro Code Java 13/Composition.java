public class Composition {
    public static void main(String[] args) {

        // Composition = Represents a "part-of" relationship between objects
        // For example ; an Engine is "part of" a car
        // Allows complex objects to be constructed from smaller objects

        CarComposition car = new CarComposition("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        // Its like an object composed within another object
        // Engine is part of car

        car.start();

    }
}
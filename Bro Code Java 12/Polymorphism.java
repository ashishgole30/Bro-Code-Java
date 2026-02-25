public class Polymorphism {
    public static void main(String[] args) {

        // POLYMORPHISM = the ability of an object to identify as more than one type
        // POLY = many
        // MORPH = form

        // objects can identfy as other objects
        // objects can be treaed as objects of a common superclass

        // NOTE- Polymorphism can also be achieved using interfaces

        // Dog identify as a dog , animal , organism...

        // Three objects car,bike,boat
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        // Calling the go() method
        car.go();
        bike.go();
        boat.go();

        // cars bikes and boats all extend the vehicle class
        Vehicle[] vehicles = { car, bike, boat };

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
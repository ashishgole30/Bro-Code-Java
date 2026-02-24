public class ToString {
    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class
        // Used to return a string representation of an object
        // By default, it returns a hash code as a uniwue identifier
        // It can be overridden to provide meaningful details

        Car car = new Car("Ford", "Mustang", 2025, "Red");

        // If We output our car object directly
        // techically we will be given a hash code
        // Its a unique identifier that uses objects memory address
        // System.out.println(car);

        // Now usually if we want details of the car as output
        // we write
        // System.out.println(car.make);
        // System.out.println(car.model);
        // System.out.println(car.year);
        // System.out.println(car.color);

        // but now as we have overridden the toString method in our Car class
        // we can just output the car object directly and it will give us the details
        System.out.println(car);
    }
}

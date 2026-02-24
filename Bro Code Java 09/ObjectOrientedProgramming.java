public class ObjectOrientedProgramming {
    public static void main(String[] args) {

        // Object = An entity that holds data (attributes)
        // and can perform actions
        // It is a reference data type
        // objects can have things and do things

        // class = blueprint for creating objects
        // objects are instances of a class

        // Creating car object
        // Syntax: ClassName objectName = new ClassName();

        // car object is an instance of the Car class
        // car object created
        Car car1 = new Car();

        // if we print car1 object directly
        // we get a memory address
        // System.out.println(car1);

        // to access the attributes of the car1 object
        // we use the dot operator
        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);

        // modfying/ changing the attributes of the car1 object

        car1.model = "F-150";
        System.out.println(car1.model);

        // to access the methods of the car1 object
        System.out.println(car1.isRunning);
        car1.start();
        System.out.println(car1.isRunning);
        car1.stop();
        System.out.println(car1.isRunning);

        car1.drive();
        car1.brake();
    }
}

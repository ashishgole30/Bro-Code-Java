public class Getters_Setters {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE and you can additonal logic
        // SETTERS = Methods that make a field WRITEBALE

        Car car = new Car("Charger", "Yellow", 10000);
        // The Car attributes are publically accessible
        // which means we can view and change them easily

        // example we can simply change model of car as follows:
        // car.model = "Corvette";
        // So to avoid this
        // while declaring attributes in Car class
        // we add the access modifier of "private" as follows:
        // private String model;
        // private String color;
        // private int price;

        // this will not print the color/model/price
        // since they are private
        // System.out.println(car.color + " " + car.model + " " + car.price);

        // Hence to read and write private things , we use
        // Getters & Setters

        // BUt this will print now
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

        // SETTERS
        car.setColor("Blue");
        car.setPrice(5000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
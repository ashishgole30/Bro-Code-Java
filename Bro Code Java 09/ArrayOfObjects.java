public class ArrayOfObjects {
    public static void main(String[] args) {

        // created 3 objects of the Cars class with values
        Cars car1 = new Cars("Mustang", "Red");
        Cars car2 = new Cars("Camaro", "Yellow");
        Cars car3 = new Cars("Challenger", "Green");

        // creating an array of objects
        // Syntax: ClassName[] arrayName = new ClassName[size];
        Cars[] carsArray1 = { car1, car2, car3 };

        // printing the values of the objects in the array using a for-each loop
        for (Cars cars : carsArray1) {
            cars.drive();
        }

        // adding a separator for better readability
        System.out.println("-----------------------------");

        // you can also create an array of objects without initializing it with values
        // Syntax:
        // ClassName[] arrayName = { new ClassName(value1, value1), new
        // ClassName(value2 , value2), ... };
        Cars[] carsArray2 = { new Cars("Corvette", "Blue"),
                new Cars("Viper", "Black"),
                new Cars("Charger", "White") };

        // printing the values of the objects in the array using a for-each loop
        for (Cars cars : carsArray2) {
            cars.drive();
        }

        // adding a separator for better readability
        System.out.println("-----------------------------");

        // you can change color of each car in the array using a for-each loop

        for (Cars cars : carsArray2) {
            cars.color = "Pink";
        }

        // printing the values of the objects in the array using a for-each loop to see
        // the changes
        for (Cars cars : carsArray2) {
            cars.drive();
        }

    }
}

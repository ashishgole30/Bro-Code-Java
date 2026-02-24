
// RANDOM CLASS AND RANDOM NUMBERS
// we need to import random class
import java.util.Random;

public class RandomNumbers1 {
    public static void main(String[] args) {
        Random random = new Random(); // Random object
        // Random class - name of our object = new Random()
        // - creating a new instance of Random class

        // For integers
        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(); // it has no specific range
        // it can be any integer value

        // setting a specific range
        // first number is inclusive
        // second number is exclusive
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }
}

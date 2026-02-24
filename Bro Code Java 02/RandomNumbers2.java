import java.util.Random;

public class RandomNumbers2 {
    public static void main(String[] args) {
        Random random = new Random();

        // for doubles

        double number;

        number = random.nextDouble();
        System.out.println("Random double: " + number);
    }
}

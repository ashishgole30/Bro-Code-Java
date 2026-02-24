import java.util.Random;

public class RandomNumbers3 {
    public static void main(String[] args) {
        Random random = new Random();
        // for booleans

        boolean isHeads;

        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("It's heads!");
        } else {
            System.out.println("It's tails!");
        }

    }
}

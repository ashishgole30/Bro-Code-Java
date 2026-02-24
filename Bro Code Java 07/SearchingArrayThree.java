import java.util.Scanner;

public class SearchingArrayThree {
    public static void main(String[] args) {

        // SEARCHING AN ARRAY

        Scanner scanner = new Scanner(System.in);

        // create an array of strings
        String[] fruits = { "Apple", "Orange", "Banana" };
        boolean isFound = false;
        String target;

        // search for a specific fruit
        System.out.print("Enter the name of the fruit to search: ");
        target = scanner.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                System.out.println("Fruit found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Fruit not found in the array.");
        }

        scanner.close();
    }
}

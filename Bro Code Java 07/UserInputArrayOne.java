import java.util.Scanner;

public class UserInputArrayOne {
    public static void main(String[] args) {

        // 1. Creating an array with a specific size and then passing in the values for
        // each index number in the array

        // 2. Creating an array with a specific size and then using user input to pass
        // in the values for each index number in the array

        // 1.
        // We create an array with a specific size
        // Syntax: dataType[] arrayName = new dataType[size];
        String[] foodsOne = new String[3];

        foodsOne[0] = "Pizza";
        foodsOne[1] = "Taco";
        foodsOne[2] = "Hamburger";

        for (String food : foodsOne) {
            System.out.println(food);
        }
        // We have created an array of size 3
        // Then we passed in the values for each index number in the array
        // Finally we printed the values in the array using an enhanced for loop
        System.out.println("-----------------------------");

        // 2.
        Scanner scanner = new Scanner(System.in);
        String[] foodsTwo = new String[3];

        for (int i = 0; i < foodsTwo.length; i++) {
            System.out.print("Enter a food: ");
            foodsTwo[i] = scanner.nextLine();
        }

        for (String food : foodsTwo) {
            System.out.println(food);
        }

        scanner.close();
    }
}

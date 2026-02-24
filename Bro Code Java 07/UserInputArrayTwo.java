import java.util.Scanner;

public class UserInputArrayTwo {
    public static void main(String[] args) {

        // 1. User Enters Size of Array and then Enters the Elements of the Array

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("How many number of elements should this array have?:");
        size = scanner.nextInt();

        scanner.nextLine();

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a Food:");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods) {
            System.out.print(food + " ");
        }

        scanner.close();
    }
}

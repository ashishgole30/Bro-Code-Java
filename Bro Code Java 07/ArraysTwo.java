import java.util.Arrays;

public class ArraysTwo {
    public static void main(String[] args) {

        // 1. Length of an Array .length
        // 2. Printing all the elements in an array
        // 3. Enhanced for loop (for-each loop)
        // 4. Sorting an array alphabetically .sort()
        // 5. Fill method

        // 1. Length of an Array
        String[] fruits = { "Apple", "Orange", "Banana", "Coconut" };
        int numberOfFruits = fruits.length;
        System.out.println(numberOfFruits);
        // there are 4 elements in the array so it will print 4
        System.out.println("------------------------------");

        // 2. Printing all the elements in an array
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

        // 3. Enhanced for loop (for-each loop)
        // Syntax: for (dataType variableName : arrayName) { // code to be executed }
        // fot every fruit in my array of fruits, print the fruit
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

        // 4. Sorting an array
        // To sort an array, we can use the Arrays.sort() method from the java.util
        // package
        // So we import the Arrays class at the top of our code
        // import java.util.Arrays;

        Arrays.sort(fruits);
        // Now the fruits array is sorted in alphabetical order
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        System.out.println("------------------------------");

        // 5. Fill method
        // we can fill all the elements of an array with a specific value using the
        // Arrays.fill() method

        Arrays.fill(fruits, "Grapes");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }

}
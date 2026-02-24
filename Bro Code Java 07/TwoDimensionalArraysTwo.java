public class TwoDimensionalArraysTwo {
    public static void main(String[] args) {

        // 2D array = An array where each element is an array
        // Also known as multidimensional array
        // useful fot storing a matrix of data

        String[][] groceries = {
                { "apple", "orange", "banana" },
                { "potato", "onion", "carrot" },
                { "chicken", "pork", "beef", "fish" }
        };

        // Changing an element in a 2D array
        // You will use two indices

        // Example: Change "apple" to "pineapple"
        // first index is the row
        // second index is the column
        groceries[0][0] = "pineapple";

        // Example: Changing potato to sweet potato
        groceries[1][0] = "sweet potato";

        // Example: Changing pork to eggs
        groceries[2][1] = "eggs";

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}

public class TwoDimensionalArraysOne {
    public static void main(String[] args) {

        // 2D array = An array where each element is an array
        // Also known as multidimensional array
        // useful fot storing a matrix of data

        // first array
        String[] fruits = { "apple", "orange", "banana" };
        // second array
        String[] vegetables = { "potato", "onion", "carrot" };
        // third array
        String[] meats = { "chicken", "pork", "beef", "fish" };

        // 2D array
        String[][] groceriesone = { fruits, vegetables, meats };

        // OR

        // 2D array
        String[][] groceriestwo = {
                { "apple", "orange", "banana" },
                { "potato", "onion", "carrot" },
                { "chicken", "pork", "beef", "fish" }
        };

        for (String[] foods : groceriesone) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        for (String[] foods : groceriestwo) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}

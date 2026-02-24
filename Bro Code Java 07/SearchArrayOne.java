public class SearchArrayOne {
    public static void main(String[] args) {

        // SEARCHING AN ARRAY

        // create an array of numbers
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // what number are we looking for?
        // created a variable to hold the target number
        int target = 7;
        boolean isFound = false;

        // for loop
        // intiialization: int i = 0 because we want to start at the first index of the
        // array
        // condition: i < numbers.length because we want to loop through the entire
        // array
        // increment: i++ because we want to move to the next index of the array

        // if statement to check if the target number is equal to the current number in
        // the array
        // print the index of the target number if it is found and break out of the loop
        // break because we only want to find the first occurrence of the target number
        // in the array

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Element found at index:" + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element not found in the array.");
        }
    }
}

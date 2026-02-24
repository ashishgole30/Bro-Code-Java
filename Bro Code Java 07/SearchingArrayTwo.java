public class SearchingArrayTwo {
    public static void main(String[] args) {

        // SEARCHING AN ARRAY

        // create an array of strings
        String[] fruits = { "Apple", "Orange", "Banana" };

        // search for a specific fruit
        String target = "Orange";
        boolean isFound = false;

        // if we use == to compare strings, it will compare the references( we will end
        // up comparing the memory addresses),
        // not the content of the strings.
        // So we should use the equals() method to compare the content of the strings.

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
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListOne {
    public static void main(String[] args) {

        // Need to import import java.util.ArrayList;
        // ArrayList = A resizable array that stores objects
        // Arrays are fixed in size but ArrayLists can change.
        // add. is a built in method of ArrayList
        // <> is diamond operator
        // remove method to an element at specific index
        // set method at a certain index with set a certain element
        // get method to get a certain element using inxdex
        // size method gives total size of our array list
        // To sort array list in alphabetical order, use Collections Framewrok and call
        // the sort method and
        // pass in our array list and also import import java.util.Collections;

        // Integers
        ArrayList<Integer> listone = new ArrayList<>();

        listone.add(3);
        listone.add(1);
        listone.add(2);

        System.out.println(listone);

        // Doubles
        ArrayList<Double> listtwo = new ArrayList<>();

        listtwo.add(3.14);
        listtwo.add(1.22);
        listtwo.add(2.43);

        System.out.println(listtwo);

        // Strings
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        fruits.remove(0);
        fruits.set(1, "Pineapple");

        System.out.println(fruits);
        System.out.println(fruits.get(2));
        System.out.println(fruits.size());

        Collections.sort(fruits);
        System.out.println(fruits);

        // To print array list using enhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
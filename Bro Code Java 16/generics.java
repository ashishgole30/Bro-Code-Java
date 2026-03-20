import java.util.ArrayList;

public class generics {
    public static void main(String[] args) {

        // GENERICS = A concept where you can write a class,interface or a method
        // that is compatible with different data types
        // <T> type parameter (placeholder that gets replaced with a real type)
        // <String/Integer/Boolean> type argument (specifies the type)

        /*
         * ArrayList<String> fruits = new ArrayList<>();
         * 
         * fruits.add("apple");
         * fruits.add("orange");
         * fruits.add("banana");
         */

        Box<String> box = new Box<>();
        box.setItem("banana");
        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("apple", 1.23);
        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        Product<String, Integer> product2 = new Product<>("ticket", 15);
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
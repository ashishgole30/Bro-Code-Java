import java.util.HashMap;

public class hashmaps {
    public static void main(String[] args) {

        // HASHMAP = A data structure that stores key-value pairs
        // keys are unique , but values can be duplicated
        // does not maintain any order, but is memory efficient
        // HashMap<Key , Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.25);

        // map.remove("coconut");

        System.out.println(map);
        System.out.println(map.get("coconut"));
        System.out.println(map.containsKey("banana"));
        System.out.println(map.containsKey("kiwi"));

        if (map.containsKey("apple")) {
            System.out.println(map.get("apple"));
        } else {
            System.out.println("Key not found");
        }

        System.out.println(map.containsValue(1.25));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }

    }
}
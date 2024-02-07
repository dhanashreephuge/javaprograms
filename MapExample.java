package collection;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the map
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);
        hashMap.put("Alice", 27); // Overwrites the previous value for "Alice"

        System.out.println("HashMap: " + hashMap);

        // Accessing values from the map
        int ageOfBob = hashMap.get("Bob");
        System.out.println("Age of Bob: " + ageOfBob);

        // Checking if a key exists
        boolean existsAlice = hashMap.containsKey("Alice");
        System.out.println("Is Alice present? " + existsAlice);

        // Removing a key-value pair from the map
        hashMap.remove("Charlie");
        System.out.println("HashMap after removing Charlie: " + hashMap);

        // Iterating over the map Entries
        System.out.println("Entries in the map:");
        System.out.println("Entry:"+hashMap.entrySet());

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

package collection;
import java.util.Vector;
import java.util.Iterator;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> namesVector = new Vector<>();

        // Adding elements to the Vector
        namesVector.add("Alice");
        namesVector.add("Bob");
        namesVector.add("Charlie");
        namesVector.add("David");

        // Displaying the Vector elements using an Iterator
        System.out.println("Vector elements:");
        Iterator<String> iterator = namesVector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Updating an element at a specific index
        namesVector.set(1, "UpdatedBob");

        // Displaying the updated Vector elements
        System.out.println("\nUpdated Vector elements:");
        for (String name : namesVector) {
            System.out.println(name);
        }

        // Removing an element
        namesVector.remove("Charlie");

        // Displaying the final Vector elements
        System.out.println("\nFinal Vector elements:");
        namesVector.forEach(System.out::println);
    }
}


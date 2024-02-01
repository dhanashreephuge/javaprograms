package collection;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList to store strings
        LinkedList<String> fruitsList = new LinkedList<>();

        // Adding elements to the LinkedList
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Mango");

        // Displaying elements of the LinkedList
        System.out.println("Elements in the LinkedList:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }

        // Adding an element at the beginning
        fruitsList.addFirst("Grapes");

        // Adding an element at the end
        fruitsList.addLast("Pineapple");

        // Removing an element by value
        fruitsList.remove("Banana");

        // Displaying modified elements of the LinkedList
        System.out.println("\nModified Elements in the LinkedList:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }

        // Checking if the LinkedList contains a specific element
        if (fruitsList.contains("Mango")) {
            System.out.println("\nThe LinkedList contains the element 'Mango'.");
        }

        // Getting the size of the LinkedList
        System.out.println("\nSize of the LinkedList: " + fruitsList.size());
    }
}


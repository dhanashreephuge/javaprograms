package collection;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue to store strings
        Queue<String> stringQueue = new LinkedList<>();

        // Enqueueing elements into the queue
        stringQueue.add("Apple");
        stringQueue.add("Banana");
        stringQueue.add("Orange");

        // Displaying elements of the queue
        System.out.println("Elements in the Queue:");
        for (String fruit : stringQueue) {
            System.out.println(fruit);
        }

        // Dequeueing an element from the queue
        String dequeuedElement = stringQueue.poll();
        System.out.println("\nDequeued Element: " + dequeuedElement);

        // Displaying modified elements of the queue
        System.out.println("\nModified Elements in the Queue:");
        for (String fruit : stringQueue) {
            System.out.println(fruit);
        }

        // Enqueueing more elements into the queue
        stringQueue.offer("Mango");
        stringQueue.offer("Grapes");

        // Displaying the updated elements of the queue
        System.out.println("\nUpdated Elements in the Queue:");
        for (String fruit : stringQueue) {
            System.out.println(fruit);
        }

        // Checking if the queue contains a specific element
        if (stringQueue.contains("Banana")) {
            System.out.println("\nThe Queue contains the element 'Banana'.");
        }

        // Getting the size of the queue
        System.out.println("\nSize of the Queue: " + stringQueue.size());
    }
}


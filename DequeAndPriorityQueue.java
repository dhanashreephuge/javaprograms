package collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class DequeAndPriorityQueue {
    public static void main(String[] args) {
        // Creating a Deque
        Deque<String> deque = new LinkedList<>();

        // Adding elements to the deque
        deque.add("Apple");
        deque.addFirst("Mango");
        deque.addLast("Banana");
        deque.offer("Grapes");
        deque.add("Apple");
        
        System.out.println("Deque: " + deque);

        // Removing elements from the deque
        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque after removal: " + deque);
        System.out.println("=================================================");
        // Creating a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the priority queue
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(2);

        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Head:"+priorityQueue.element());
    	System.out.println("Head:"+priorityQueue.peek());

        // Removing elements from the priority queue
        priorityQueue.poll();
        priorityQueue.poll();

        System.out.println("PriorityQueue after removal: " + priorityQueue);
    }
}

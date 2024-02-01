package collection;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Adding elements to the ArrayList
        numbersList.add(5);
        numbersList.add(10);
        numbersList.add(15);
        numbersList.add(20);

        // Displaying elements of the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (Integer number : numbersList) {
            System.out.println(number);
        }

        // Adding an element at a specific index
        numbersList.add(1, 25);

        // Removing an element by value
        numbersList.remove(Integer.valueOf(15));

        // Displaying modified elements of the ArrayList
        System.out.println("\nModified Elements in the ArrayList:");
        for (Integer number : numbersList) {
            System.out.println(number);
        }

        // Checking if the ArrayList contains a specific element
        if (numbersList.contains(25)) {
            System.out.println("\nThe ArrayList contains the element 25.");
        }

        // Getting the size of the ArrayList
        System.out.println("\nSize of the ArrayList: " + numbersList.size());
    }
}


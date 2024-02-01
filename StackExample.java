package collection;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack to store integers
        Stack<Integer> numberStack = new Stack<>();

        // Pushing elements onto the stack
        numberStack.push(5);
        numberStack.push(10);
        numberStack.push(15);
        numberStack.push(20);

        // Displaying elements of the stack
        System.out.println("Elements in the Stack:");
        for (Integer number : numberStack) {
            System.out.println(number);
        }

        // Popping an element from the stack
        int poppedElement = numberStack.pop();
        System.out.println("\nPopped Element: " + poppedElement);

        // Displaying modified elements of the stack
        System.out.println("\nModified Elements in the Stack:");
        for (Integer number : numberStack) {
            System.out.println(number);
        }

        // Peeking at the top element of the stack without removing it
        int topElement = numberStack.peek();
        System.out.println("\nTop Element: " + topElement);

        // Checking if the stack is empty
        if (numberStack.isEmpty()) {
            System.out.println("\nThe Stack is empty.");
        } else {
            System.out.println("\nThe Stack is not empty.");
        }

        // Getting the size of the stack
        System.out.println("\nSize of the Stack: " + numberStack.size());
    }
}

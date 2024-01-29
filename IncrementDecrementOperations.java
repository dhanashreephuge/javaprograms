public class IncrementDecrementOperations {
    public static void main(String[] args) {
        int count = 5;

        // Increment
        System.out.println("Original value: " + count);
        count++; // Increment by 1
        System.out.println("After Increment: " + count);

        // Decrement
        count--; // Decrement by 1
        System.out.println("After Decrement: " + count);

        // post Increment and Decrement
        int result1 = count++; // Post-increment (uses the current value, then increments)
        int result2 = --count; // Pre-decrement (decrements first, then uses the value)

        System.out.println("Result of Post-increment: " + result1);
        System.out.println("Result of Pre-decrement: " + result2);
        System.out.println("Current value: " + count);
    }
}
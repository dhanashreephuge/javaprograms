package array;

public class SimpleArrayProgram {

    public static void main(String[] args) {
        // Initialize an array of integers
        int[] numbers = {3, 7, 1, 9, 5};

        // Calculate the sum of array elements
        int sum = calculateSum(numbers);

        // Print the result
        System.out.println("The sum of the array elements is: " + sum);
    }

    // Method to calculate the sum of array elements
    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}

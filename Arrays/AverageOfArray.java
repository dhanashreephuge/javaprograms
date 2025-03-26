import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the numbers
        double[] numbers = new double[n];

        // Ask the user to enter the numbers
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Calculate the sum of all numbers
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        double average = sum / n;

        System.out.println("The average is: " + average);

        scanner.close();
    }
}

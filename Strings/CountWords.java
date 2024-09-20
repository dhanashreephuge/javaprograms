//Write a Java program to count the number of words in a string
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Call the wordCount method and print the result
        int wordCount = countWords(input);
        System.out.println("The number of words in the string is: " + wordCount);
        
        // Close the scanner object
        scanner.close();
    }

    // Method to count words in a string
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        // Split the string based on spaces and return the length of the resulting array
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}

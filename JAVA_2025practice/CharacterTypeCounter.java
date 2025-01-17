// a Java program to count the different types of characters 
//(letters, digits, spaces, and special characters) in a given string:

import java.util.Scanner;

public class CharacterTypeCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize counters
        int letterCount = 0, digitCount = 0, spaceCount = 0, specialCharCount = 0;

        // Iterate through each character in the string
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else {
                specialCharCount++;
            }
        }

        // Display the counts
        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of spaces: " + spaceCount);
        System.out.println("Number of special characters: " + specialCharCount);
    }
}



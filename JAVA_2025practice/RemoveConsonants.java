import java.util.Scanner;

public class RemoveConsonants {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call method to remove consonants
        String result = removeConsonants(input);

        // Display the result
        System.out.println("String after removing consonants: " + result);
    }

    /**
     * Removes all consonants from the given string.
     *
     * @param str Input string
     * @return String with only vowels and non-alphabetic characters
     */
    public static String removeConsonants(String str) {
        // Regular expression to match consonants
        return str.replaceAll("(?i)[bcdfghjklmnpqrstvwxyz]", "");
    }
}



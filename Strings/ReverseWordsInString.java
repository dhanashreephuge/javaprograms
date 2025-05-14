public class ReverseWordsInString {
    public static String reverseWords(String s) {
        // Trim the input string to remove leading/trailing spaces
        s = s.trim();

        // Split the string by one or more spaces using regex
        String[] words = s.split("\\s+");

        // Use a StringBuilder to build the result in reverse order
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);

            // Add space if it's not the last word
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    // Test cases
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));        // Output: "blue is sky the"
        System.out.println(reverseWords("  hello world  "));        // Output: "world hello"
        System.out.println(reverseWords("a good   example"));       // Output: "example good a"
    }
}


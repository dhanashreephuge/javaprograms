public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        // Trim trailing spaces
        s = s.trim();
        
        // Find the index of the last space
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // Return the length of the substring after the last space
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(lengthOfLastWord("Hello World"));              // Output: 5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
        System.out.println(lengthOfLastWord("luffy is still joyboy"));   // Output: 6
    }
}


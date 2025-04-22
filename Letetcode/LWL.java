public class LWL {
    public static int lengthOfLastWord(String s) {
        // Trim the string to remove leading/trailing spaces
        s = s.trim();
        // Find the index of the last space
        int lastSpaceIndex = s.lastIndexOf(' ');
        // Return the length of the substring after the last space
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        String input1 = "Hello World";
        String input2 = "   fly me   to   the moon  ";
        String input3 = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(input1)); // Output: 5
        System.out.println(lengthOfLastWord(input2)); // Output: 4
        System.out.println(lengthOfLastWord(input3)); // Output: 6
    }
}










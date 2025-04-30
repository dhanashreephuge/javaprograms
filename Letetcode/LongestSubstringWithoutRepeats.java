import java.util.HashSet;

public class LongestSubstringWithoutRepeats {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        // Use a set to store characters in the current window
        HashSet<Character> set = new HashSet<>();

        int left = 0, right = 0;

        while (right < n) {
            char currentChar = s.charAt(right);
            // If the character is not in the set, add it and update maxLength
            if (!set.contains(currentChar)) {
                set.add(currentChar);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                // If the character is in the set, remove the leftmost character
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String[] testCases = {"abcabcbb", "bbbbb", "pwwkew", ""};
        
        for (String testCase : testCases) {
            int result = lengthOfLongestSubstring(testCase);
            System.out.println("Input: \"" + testCase + "\" => Output: " + result);
        }
    }
}


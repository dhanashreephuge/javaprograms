public class PalindromeChecker {

    public static boolean isPalindrome(String s) {
        // Use two pointers to check from both ends
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Move left pointer if not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Move right pointer if not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters ignoring case
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // Move both pointers inward
            left++;
            right--;
        }

        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        String[] testCases = {
            "A man, a plan, a canal: Panama",
            "race a car",
            " "
        };

        for (String test : testCases) {
            System.out.println("Input: \"" + test + "\"");
            System.out.println("Output: " + isPalindrome(test));
            System.out.println();
        }
    }
}

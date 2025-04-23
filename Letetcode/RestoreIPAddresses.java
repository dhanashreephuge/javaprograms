import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {

    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, "", 0, result);
        return result;
    }

    private void backtrack(String s, int index, String currentIP, int segmentCount, List<String> result) {
        // Base case: if we've placed 4 segments and used all characters
        if (segmentCount == 4 && index == s.length()) {
            result.add(currentIP.substring(0, currentIP.length() - 1)); // remove trailing dot
            return;
        }

        // Base case: too many segments or characters exhausted prematurely
        if (segmentCount >= 4 || index >= s.length()) {
            return;
        }

        // Try segments of length 1 to 3
        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String segment = s.substring(index, index + len);

            // Check for leading zeros
            if (segment.length() > 1 && segment.startsWith("0")) {
                continue;
            }

            int value = Integer.parseInt(segment);

            // Check for valid IP range
            if (value >= 0 && value <= 255) {
                backtrack(s, index + len, currentIP + segment + ".", segmentCount + 1, result);
            }
        }
    }

    // Example usage
    public static void main(String[] args) {
        RestoreIPAddresses solution = new RestoreIPAddresses();
        String input = "25525511135";
        List<String> validIPs = solution.restoreIpAddresses(input);
        System.out.println(validIPs);
    }
}


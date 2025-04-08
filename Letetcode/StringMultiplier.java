public class StringMultiplier {
    public static String multiply(String num1, String num2) {
        // Edge case
        if (num1.equals("0") || num2.equals("0")) return "0";

        int n1 = num1.length();
        int n2 = num2.length();
        int[] result = new int[n1 + n2];

        // Multiply each digit and add the results to the result array
        for (int i = n1 - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';
            for (int j = n2 - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';
                int mul = d1 * d2;
                int sum = mul + result[i + j + 1];

                result[i + j] += sum / 10;         // Carry
                result[i + j + 1] = sum % 10;      // Current digit
            }
        }

        // Convert result array to string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // Skip leading zeros
                sb.append(num);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(multiply("2", "3"));        // Output: 6
        System.out.println(multiply("123", "456"));    // Output: 56088
        System.out.println(multiply("0", "12345"));    // Output: 0
        System.out.println(multiply("999", "999"));    // Output: 998001
    }
}


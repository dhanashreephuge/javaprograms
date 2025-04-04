import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {
        // Mapping of Roman symbols to their integer values
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Iterate from the end to the beginning of the string
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(s.charAt(i));

            // If current value is less than the previous value, subtract it (e.g., IV)
            if (currValue < prevValue) {
                total -= currValue;
            } else {
                total += currValue;
            }

            prevValue = currValue;
        }

        return total;
    }

    // Example usage
    public static void main(String[] args) {
        RomanToInteger converter = new RomanToInteger();

        System.out.println(converter.romanToInt("III"));      // Output: 3
        System.out.println(converter.romanToInt("LVIII"));    // Output: 58
        System.out.println(converter.romanToInt("MCMXCIV"));  // Output: 1994
    }
}

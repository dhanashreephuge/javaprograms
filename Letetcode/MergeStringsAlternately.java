public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        int len1 = word1.length(), len2 = word2.length();

        // Add alternating characters
        while (i < len1 && j < len2) {
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }

        // Append remaining characters from word1
        while (i < len1) {
            merged.append(word1.charAt(i++));
        }

        // Append remaining characters from word2
        while (j < len2) {
            merged.append(word2.charAt(j++));
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));   // Output: apbqcr
        System.out.println(mergeAlternately("ab", "pqrs"));   // Output: apbqrs
        System.out.println(mergeAlternately("abcd", "pq"));   // Output: apbqcd
    }
}

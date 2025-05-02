import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray); // Sort characters to use as key
            String key = new String(charArray);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        // Example 1
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Output: " + groupAnagrams(strs1));

        // Example 2
        String[] strs2 = {""};
        System.out.println("Output: " + groupAnagrams(strs2));

        // Example 3
        String[] strs3 = {"a"};
        System.out.println("Output: " + groupAnagrams(strs3));
    }
}


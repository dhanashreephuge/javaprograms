import java.util.HashMap;
import java.util.Map;

public class MaxOperations {

    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int operations = 0;

        for (int num : nums) {
            int complement = k - num;
            if (map.getOrDefault(complement, 0) > 0) {
                // Found a pair
                operations++;
                map.put(complement, map.get(complement) - 1);
            } else {
                // Store the current number
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int k1 = 5;
        System.out.println("Output: " + maxOperations(nums1, k1)); // Output: 2

        int[] nums2 = {3, 1, 3, 4, 3};
        int k2 = 6;
        System.out.println("Output: " + maxOperations(nums2, k2)); // Output: 1
    }
}

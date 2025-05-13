public class LongestSubarrayWithOnes {

    public static int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // We must delete one element, so take (right - left)
            maxLength = Math.max(maxLength, right - left);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 0, 1};
        int[] nums2 = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        int[] nums3 = {1, 1, 1};

        System.out.println("Output 1: " + longestSubarray(nums1)); // Output: 3
        System.out.println("Output 2: " + longestSubarray(nums2)); // Output: 5
        System.out.println("Output 3: " + longestSubarray(nums3)); // Output: 2
    }
}

public class MaxAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        // Calculate the sum of the first window of size k
        double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        double currentSum = maxSum;

        // Slide the window across the array
        for (int i = k; i < n; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return the maximum average
        return maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        System.out.printf("Output: %.5f\n", findMaxAverage(nums1, k1)); // Output: 12.75000

        int[] nums2 = {5};
        int k2 = 1;
        System.out.printf("Output: %.5f\n", findMaxAverage(nums2, k2)); // Output: 5.00000
    }
}

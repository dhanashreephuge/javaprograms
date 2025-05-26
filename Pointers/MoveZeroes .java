public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Move all non-zero elements to the beginning
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Fill the rest of the array with zeroes
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    // Test the function
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.print("Output 1: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.print("Output 2: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}

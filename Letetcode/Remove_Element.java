public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Counter for elements not equal to val
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move valid element to front
                k++;
            }
        }
        
        return k; // Return count of elements not equal to val
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = solution.removeElement(nums, val);
        
        System.out.println("Output: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

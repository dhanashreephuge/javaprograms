class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1); // Ensure nums1 is the smaller array
        }
        
        int x = nums1.length;
        int y = nums2.length;
        int low = 0, high = x;
        
        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;
            
            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];
            
            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];
            
            if (maxX <= minY && maxY <= minX) {
                if ((x + y) % 2 == 0) {
                    return ((double) Math.max(maxX, maxY) + Math.min(minX, minY)) / 2;
                } else {
                    return (double) Math.max(maxX, maxY);
                }
            } else if (maxX > minY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }
        
        throw new IllegalArgumentException("Input arrays are not sorted properly");
    }
    
    public static void main(String[] args) {
        MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
        
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2)); // Output: 2.0
        
        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println(solution.findMedianSortedArrays(nums3, nums4)); // Output: 2.5
    }
}

//==============================================================================================
// ### How to Find the Median of Two Sorted Arrays

// The **median** of a sorted array is the middle element if the array has an odd length, or the average of the two middle elements if it has an even length.

// Given two sorted arrays **nums1** and **nums2**, we want to find the median of the combined sorted array **without merging them completely**. 

// ---

// ### **Approach: Binary Search (O(log(m + n)))**
// Instead of merging the arrays, we use **binary search** to find the correct partition.

// #### **Step-by-Step Explanation**
// 1. **Ensure nums1 is the smaller array**  
//    - If **nums1** is larger than **nums2**, swap them. This ensures we perform binary search on the smaller array (to reduce complexity).

// 2. **Perform binary search on nums1**  
//    - Define `low = 0` and `high = nums1.length`.
//    - Find the partition index:  
//      \[
//      \text{partitionX} = \frac{\text{low} + \text{high}}{2}
//      \]
//      \[
//      \text{partitionY} = \frac{\text{total elements + 1}}{2} - \text{partitionX}
//      \]
//    - This ensures that the left half contains **half of the elements** (or slightly more if the total is odd).

// 3. **Get the key values around the partition**  
//    - `maxX = nums1[partitionX - 1]` (left max of nums1)
//    - `minX = nums1[partitionX]` (right min of nums1)
//    - `maxY = nums2[partitionY - 1]` (left max of nums2)
//    - `minY = nums2[partitionY]` (right min of nums2)
//    - Handle edge cases by setting **min/max values to ±∞** when partitions go out of bounds.

// 4. **Check if the partition is correct**  
//    - If **maxX ≤ minY** and **maxY ≤ minX**, we found the correct partition.
//      - If the total number of elements is **even**:  
//        \[
//        \text{median} = \frac{\max(\text{maxX}, \text{maxY}) + \min(\text{minX}, \text{minY})}{2}
//        \]
//      - If **odd**, the median is simply:
//        \[
//        \max(\text{maxX}, \text{maxY})
//        \]

// 5. **Adjust search range**  
//    - If **maxX > minY**, move left (`high = partitionX - 1`).
//    - If **maxY > minX**, move right (`low = partitionX + 1`).

// ---

// ### **Example Walkthrough**
// #### Example 1:
// ```plaintext
// nums1 = [1, 3]
// nums2 = [2]
// ```
// - Merged array: `[1, 2, 3]`
// - Median = `2.0`

// #### Example 2:
// ```plaintext
// nums1 = [1, 2]
// nums2 = [3, 4]
// ```
// - Merged array: `[1, 2, 3, 4]`
// - Median = `(2 + 3) / 2 = 2.5`

// This method finds the median in **O(log(min(m, n)))** time complexity instead of **O(m + n)**.

// Let me know if you need further clarification! 
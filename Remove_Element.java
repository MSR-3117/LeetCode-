/*
Problem: Remove Element (LeetCode 27)

Approach:
The goal is to remove all occurrences of a given value from the array in-place
and return the number of remaining elements.

Since the order of elements does not matter, we can use a single pointer
to overwrite values that are not equal to the given target.

Algorithm:
1. Initialize an index pointer at 0 to track the position for valid elements.
2. Traverse the array from left to right.
3. If the current element is not equal to the target value:
   - Copy it to nums[index]
   - Increment index
4. After traversal, index represents the count of elements not equal to val.

Why This Works:
- Elements equal to val are skipped.
- Valid elements are compacted at the front of the array.
- The operation is done in-place without extra memory.

Time Complexity:
O(n), where n is the length of the array.

Space Complexity:
O(1), since no extra space is used.
*/

class Solution {
    public int removeElement(int[] nums, int val) {

        // Pointer to track position of valid elements
        int index = 0;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Copy element if it is not equal to val
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Return count of remaining elements
        return index;
    }
}

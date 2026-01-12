/*
Problem: Remove Duplicates from Sorted Array (LeetCode 26)

Approach:
Since the array is already sorted, all duplicate elements appear next to each other.
This allows us to use a two-pointer technique to overwrite duplicates in-place
without using any extra space.

Algorithm:
1. Use pointer i to track the index of the last unique element.
2. Traverse the array using pointer j starting from index 1.
3. Whenever nums[j] is different from nums[i], increment i and copy nums[j] to nums[i].
4. After traversal, the first (i + 1) elements of the array contain all unique values.

Why This Works:
- Sorted order guarantees duplicates are adjacent.
- We only move elements when a new unique value is found.
- The array is modified in-place as required.

Time Complexity:
O(n), where n is the number of elements in the array.

Space Complexity:
O(1), since no extra space is used.
*/

class Solution {
    public int removeDuplicates(int[] nums) {

        // Handle edge case where array is empty
        if (nums.length == 0) {
            return 0;
        }

        // Pointer to track the last unique element
        int i = 0;

        // Traverse the array starting from the second element
        for (int j = 1; j < nums.length; j++) {

            // If a new unique element is found
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        // Return the count of unique elements
        return i + 1;
    }
}

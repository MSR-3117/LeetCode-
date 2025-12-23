// Problem : Binary Search LeetCode (704)

// My Solution

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] > target) {
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

/*
Approach:

This solution uses the Binary Search algorithm to find a target element in a sorted array.

Key Logic:
- Initialize two pointers, start and end, representing the search space.
- Calculate the mid index safely to avoid integer overflow.
- If the middle element matches the target, return its index.
- If the middle element is greater than the target, discard the right half.
- If the middle element is smaller, discard the left half.
- Continue until the search space is exhausted.


Time Complexity: O(log n)
Space Complexity: O(1)
*/

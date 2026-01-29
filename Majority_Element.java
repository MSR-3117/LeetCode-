// Problem : Majority Element LeetCode (169)

// My Solution

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }
}

/*
Approach:

This solution identifies the majority element in an array by leveraging the
problem’s guaranteed constraint that a majority element always exists.

Initial Insight:
The majority element appears more than ⌊n / 2⌋ times. If the array is sorted,
this element will inevitably occupy the middle position of the array.

Instead of explicitly counting frequencies, sorting allows us to directly
access the majority element at index n / 2.

Key Logic:
- Sort the input array.
- Compute the length of the array.
- Return the element at index n / 2.

Why this works:
After sorting, elements are grouped together. Since the majority element
appears more than half the time, it must span across the center of the array.
Thus, the middle element is guaranteed to be the majority element.

Example:
Input: [3, 2, 3]
Sorted: [2, 3, 3]
n = 3 → middle index = 1
Output: 3

Another Example:
Input: [2, 2, 1, 1, 1, 2, 2]
Sorted: [1, 1, 1, 2, 2, 2, 2]
Middle element → 2

Time Complexity: O(n log n), due to sorting
Space Complexity: O(1), excluding sorting internals
*/

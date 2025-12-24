// Problem : Running Sum of 1D Array LeetCode (1480)

// My Solution

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}

/*
Approach:

This problem requires computing the running (prefix) sum of an array.

Logic Breakdown:
- Maintain a variable to store the cumulative sum.
- Traverse the array from left to right.
- Add the current element to the cumulative sum.
- Store the updated sum at the corresponding index in the result array.

Why this works:
- Each index i holds the sum of elements from index 0 to i.
- The array is processed in a single pass.

Time Complexity: O(n)
Space Complexity: O(n)
*/

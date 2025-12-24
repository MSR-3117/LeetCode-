// Problem : Build Array from Permutation LeetCode (1920)

// My Solution

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

/*
Approach:

This problem constructs a new array based on a given permutation.

Key Logic:
- For each index i, place the value nums[nums[i]] into the result array.
- The input array represents a valid permutation, so every index access
  is guaranteed to be within bounds.

Why this works:
- The permutation property ensures that nums[i] is always a valid index.
- Using a separate array avoids overwriting values needed later.

Time Complexity: O(n)
Space Complexity: O(n)
*/

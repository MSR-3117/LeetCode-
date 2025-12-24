// Problem : Concatenation of Array LeetCode (1929)

// My Solution

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length + nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            for (int j = i + nums.length; j < n; j++) {
                ans[j] = nums[i];
            }
        }
        return ans;
    }
}

/*
Approach:

The goal is to create a new array that contains the given array twice
in the same order.

Logic Breakdown:
- Create a result array of size 2 * nums.length.
- Copy the original elements into the first half.
- Copy the same elements again into the second half.

Note:
- This solution explicitly fills both halves of the array.
- It demonstrates array indexing and position mapping clearly.

Time Complexity: O(n²)
Space Complexity: O(n)
*/

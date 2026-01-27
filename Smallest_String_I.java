// Problem : Smallest Range I (LeetCode 908)
//
// My Solution

class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int val : nums) {
            if (val < min) min = val;
            if (val > max) max = val;
        }

        return (min + k) > (max - k) ? 0 : (max - k) - (min + k);
    }
}

/*
Approach:

The objective is to minimize the difference between the maximum
and minimum elements after adding or subtracting k from each element.

Logic Breakdown:
- Find the minimum and maximum values in the array.
- After applying the operation:
  - Minimum becomes (min + k)
  - Maximum becomes (max - k)
- If the adjusted minimum exceeds the adjusted maximum,
  the minimum possible range is 0.
- Otherwise, compute the difference between them.

Why this works:
- Adjusting all elements inward minimizes the overall range.
- Only the global minimum and maximum affect the final result.
- No need to modify each element individually.

Time Complexity: O(n)
Space Complexity: O(1)
*/

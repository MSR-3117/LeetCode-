// LeetCode Problem: Two Sum
/*
Approach:

This solution uses a brute-force approach to find two indices such that
the sum of their corresponding values equals the given target.

We iterate through the array using two nested loops:
- The outer loop picks the first element.
- The inner loop checks all elements after the first to avoid duplicate pairs.

If nums[i] + nums[j] equals the target, we immediately return the indices.

This approach guarantees correctness because every possible pair is checked.

Time Complexity:

O(n^2)
- Due to the nested loops checking all possible pairs.

Space Complexity:

O(1)
- No extra data structures are used.

Key Learnings:

- Brute-force solutions are simple and reliable for small input sizes.
- Early return helps reduce unnecessary iterations once the solution is found.
- This approach serves as a good baseline before optimizing with hashing.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return nums;
    }
}

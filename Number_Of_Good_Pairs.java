// Problem : Number of Good Pairs LeetCode (1512)

// My Solution

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}

/*
Approach:

The goal is to count the number of good pairs (i, j) such that:
- nums[i] == nums[j]
- i < j

Logic Breakdown:
- Use two nested loops to compare each element with the elements after it.
- Whenever a matching pair is found, increment the count.
- Ensuring j starts from i + 1 avoids duplicate and reversed pairs.

Why this works:
- Every valid pair is checked exactly once.
- The condition i < j is naturally satisfied by the loop structure.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

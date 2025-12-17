// Problem : Climbing Stairs LeetCode (70)

// My Solution

class Solution {
    public int climbStairs(int n) {
        int ways = 1;

        for (int i = 1; i <= n / 2; i++) {
            double sum = 1;

            for (int j = i; j < 2 * i; j++) {
                sum *= (double)(n - j) / (j - i + 1);
            }

            ways += sum;
        }

        return ways;
    }
}

/*
Approach:

This solution is based on a combinatorial (mathematical) approach rather than
dynamic programming.

Key Idea:
To reach the top, you can take:
- Only 1-step moves
- A combination of 1-step and 2-step moves

If we take `i` two-steps, then the remaining steps will be:
- (n - 2*i) one-steps

So the total number of moves becomes:
- i (two-steps) + (n - 2*i) (one-steps) = (n - i) moves

The problem then reduces to:
"How many unique ways can we arrange `i` two-steps among `(n - i)` total moves?"

This is a combination problem:
C(n - i, i)

Implementation Details:
- The outer loop iterates over the possible number of 2-steps.
- The inner loop calculates combinations using multiplication instead of factorials
  to avoid overflow and improve efficiency.
- The `ways` variable accumulates all valid combinations.

Time Complexity:
O(n²) in the worst case due to nested loops.

Space Complexity:
O(1), since only constant extra space is used.

This approach avoids recursion and DP arrays while still computing the correct result.
*/

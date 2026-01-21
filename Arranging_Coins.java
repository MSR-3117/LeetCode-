/*
LeetCode: Arranging Coins

Problem Summary:
Given n coins, build a staircase where the k-th row has exactly k coins.
Return the total number of complete rows that can be formed.

Approach:
- Use Binary Search to determine the maximum k such that:
  k * (k + 1) / 2 ≤ n
- Search range is from 0 to n.
- Calculate the number of coins required for a given k using the arithmetic series formula.
- Adjust search space based on comparison with n.

Key Observations:
- The sum of first k natural numbers is k * (k + 1) / 2.
- Binary Search reduces the time complexity compared to linear iteration.
- Using long prevents integer overflow during calculations.

Complexity Analysis:
Time Complexity: O(log n)
Space Complexity: O(1)

Status:
Accepted on LeetCode
*/

class Solution {
    public int arrangeCoins(int n) {
        long left = 0;  // use long to avoid overflow
        long right = n;

        while (left <= right) {
            long pivot = left + (right - left) / 2;
            long coinsUsed = pivot * (pivot + 1) / 2;

            if (coinsUsed == n) {
                return (int) pivot;
            }

            if (coinsUsed > n) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }

        return (int) right;
    }
}

// Problem : Minimum Time Visiting All Points LeetCode (1266)

// My Solution

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;

        for (int i = 1; i < points.length; i++) {
            ans += Math.max(
                Math.abs(points[i][0] - points[i - 1][0]),
                Math.abs(points[i][1] - points[i - 1][1])
            );
        }
        return ans;
    }
}

/*
Approach:

The problem asks for the minimum time required to visit all given points
in order on a 2D plane.

Logic Breakdown:
- Movement is allowed vertically, horizontally, or diagonally.
- Diagonal movement reduces both x and y coordinates at the same time.
- The minimum time to move between two points is the maximum of:
  |x₂ − x₁| and |y₂ − y₁|.
- Accumulate this value for each consecutive pair of points.

Design Choice:
- Used a single loop for simplicity and efficiency.
- No extra data structures required.
- Direct computation ensures optimal performance.

Time Complexity: O(n)
Space Complexity: O(1)
*/

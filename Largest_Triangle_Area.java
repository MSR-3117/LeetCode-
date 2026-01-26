// Problem : Largest Triangle Area LeetCode (812)

// My Solution

class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double maxArea = 0.0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    double area = triangleArea(points[i], points[j], points[k]);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    private double triangleArea(int[] a, int[] b, int[] c) {
        return Math.abs(
            a[0] * (b[1] - c[1]) +
            b[0] * (c[1] - a[1]) +
            c[0] * (a[1] - b[1])
        ) / 2.0;
    }
}

/*
Approach:

This problem requires finding the maximum area triangle formed by any
three points on a 2D plane.

Logic Breakdown:
- Iterate through all possible combinations of three points.
- For each triplet, calculate the area using the Shoelace formula.
- Track the maximum area encountered.
- Return the maximum value at the end.

Why this works:
- Any triangle can be uniquely defined by three points.
- Constraints are small, so brute-force is feasible.
- The Shoelace formula efficiently computes triangle area.

Time Complexity: O(n^3)
Space Complexity: O(1)
*/

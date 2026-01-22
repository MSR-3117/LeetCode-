/*
LeetCode: Construct the Rectangle

Problem Summary:
Given an integer area, find the dimensions of a rectangle such that:
- The area equals L × W
- L ≥ W
- The difference between L and W is minimized

Approach:
- Start from the integer square root of the area.
- Move downward to find the first divisor of the area.
- Once found, compute the corresponding length as area / width.
- This ensures the smallest difference between dimensions.

Key Observations:
- The closest factors of a number lie around its square root.
- Starting from sqrt(area) minimizes iterations.
- Ensuring L ≥ W maintains the required order.

Complexity Analysis:
Time Complexity: O(√n)
Space Complexity: O(1)

Status:
Accepted on LeetCode
*/

class Solution {
    public int[] constructRectangle(int area) {
        int i = (int) Math.sqrt(area);

        while (i >= 1 && area % i != 0) {
            i--;
        }

        return new int[] { area / i, i };
    }
}

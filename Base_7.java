/*
LeetCode: Base 7

Problem Summary:
Given an integer num, return its representation in base 7 as a string.

Approach:
- Use Java’s built-in base conversion utility.
- Integer.toString(num, 7) directly converts the number to base 7.
- Handles both positive and negative numbers correctly.

Key Observations:
- Java provides native support for base conversion.
- This approach avoids manual division and remainder logic.
- Keeps the solution concise and readable.

Complexity Analysis:
Time Complexity: O(log₇ n)
Space Complexity: O(1)

Status:
Accepted on LeetCode
*/

class Solution {
    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }
}

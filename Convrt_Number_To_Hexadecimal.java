/*
LeetCode: Convert a Number to Hexadecimal

Problem Overview:
Given an integer, convert it to its hexadecimal representation.
For negative numbers, return the hexadecimal representation using
two’s complement (32-bit signed integer).

Key Insight:
Java internally represents integers using two’s complement.
The built-in Integer.toHexString() method already handles both
positive and negative values correctly.

Approach:
- Directly use Integer.toHexString(num)
- No manual bit manipulation required

Why This Works:
- Java handles two’s complement conversion internally
- Produces lowercase hexadecimal output as required

Complexity:
Time Complexity: O(1)
Space Complexity: O(1)

Key Takeaway:
Understanding language-provided utilities can simplify problems
without sacrificing correctness or efficiency.
*/

class Solution {
    public String toHex(int num) {
        return Integer.toHexString(num);
    }
}

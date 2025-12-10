// Sqrt(x) LeetCode Problem (69)

class Solution {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
}
/*
My Approach:

The solution uses Java's built-in Math.sqrt() function to calculate the square root of
the given integer. Since the problem requires returning only the integer part of the
square root, the result is typecast to an int, which automatically truncates any decimal
portion. This aligns with the requirement of returning floor(sqrt(x)).

This method is concise and relies on Java's optimized math library, avoiding the need
to manually implement binary search or Newton's method for square root approximation.

Time Complexity:
O(1) – Math.sqrt() is a constant-time native operation.

Space Complexity:
O(1) – Only a few primitive variables are used.
*/

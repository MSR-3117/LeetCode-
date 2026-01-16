/*
Problem: Power of Three (LeetCode 326)

Approach:
Instead of repeatedly dividing n by 3, we leverage a mathematical observation.

The largest power of 3 that fits within a 32-bit signed integer is:
3^19 = 1162261467

If n is a power of 3, then it must divide 3^19 evenly.
So we check:
- n is positive
- 1162261467 % n == 0

Why this works:
All powers of 3 are divisors of the maximum power of 3 within the integer range.

Complexity Analysis:
Time Complexity: O(1)
Space Complexity: O(1)

Notes:
- This avoids loops and recursion
- Very efficient and elegant for integer constraints
- Relies on knowing the integer limit beforehand
*/

class Solution {
    public boolean isPowerOfThree(int n) {

        int maxPowerOf3 = 1162261467; // 3^19

        return n > 0 && maxPowerOf3 % n == 0;
    }
}

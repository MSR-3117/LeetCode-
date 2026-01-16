/*
Problem: Power of Four (LeetCode 342)

Approach:
We repeatedly divide the number by 4 as long as it is divisible by 4.

Steps:
1. If n is less than or equal to 0, it cannot be a power of four
2. While n is divisible by 4, divide it by 4
3. After the loop, if n becomes exactly 1, it is a power of four

This works because any power of four can be reduced to 1
by continuously dividing by 4.

Complexity Analysis:
Time Complexity: O(log4 n)
Space Complexity: O(1)

Notes:
- Simple and intuitive approach
- Avoids floating-point operations
- Works reliably within integer constraints
*/

class Solution {
    public boolean isPowerOfFour(int n) {

        if (n <= 0) return false;

        while (n % 4 == 0) {
            n = n / 4;
        }

        return n == 1;
    }
}

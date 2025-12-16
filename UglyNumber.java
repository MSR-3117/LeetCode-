// Problem : Ugly Number LeetCode (263)

// My Solution 

class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;

        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;

        return n == 1;
    }
}

/*
Approach:

This problem checks whether a given number is an Ugly Number.
An Ugly Number is a positive integer whose prime factors are limited to 2, 3, and 5.

Key Observations:
- Ugly numbers are always positive.
- The number 1 is considered an ugly number.
- If a number has any prime factor other than 2, 3, or 5, it is not ugly.
- Instead of finding all prime factors, we can repeatedly remove the allowed factors.

Logic Breakdown:
- If n is less than or equal to 0, return false since ugly numbers are positive.
- Repeatedly divide n by 2 as long as it is divisible by 2.
- Repeatedly divide n by 3 as long as it is divisible by 3.
- Repeatedly divide n by 5 as long as it is divisible by 5.
- After removing all factors of 2, 3, and 5, check the remaining value.

Explanation:
The idea is to continuously reduce the number by removing only the allowed prime
factors. If the number can be reduced to 1 using only divisions by 2, 3, and 5,
then it satisfies the definition of an ugly number. If any other prime factor exists,
it will remain in the number and prevent it from reaching 1.

Examples:
- n = 6 → 6 ÷ 2 = 3 → 3 ÷ 3 = 1 → true
- n = 8 → 8 ÷ 2 ÷ 2 ÷ 2 = 1 → true
- n = 14 → 14 ÷ 2 = 7 → false
- n = 1 → true

Time Complexity: O(log n)
Space Complexity: O(1)
*/

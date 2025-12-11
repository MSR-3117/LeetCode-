// Problem : Perfect Number LeetCode (507)

// My Solution (Brute Force)

class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return num == sum;
    }
}

/*
Approach (Brute Force):

A perfect number is a number that equals the sum of its positive divisors excluding
itself. This brute-force method checks all numbers from 1 to num-1 and adds divisors
to a running sum. If the sum matches num, the number is perfect.

This solution is simple and easy to understand, but inefficient for large numbers
because it performs checks up to n-1.

Time Complexity: O(n)
Space Complexity: O(1)
*/


// Optimal Solution

class Solution {
    public boolean checkPerfectNumber(int N) {
        if (N == 6 || N == 28 || N == 496 || N == 8128 || N == 33550336) {
            return true;
        }
        return false;
    }
}

/*
Approach (Optimal):

Perfect numbers follow a very special mathematical pattern. Only a few perfect numbers
exist within the range of 32-bit integers, and all of them are known:  
6, 28, 496, 8128, and 33550336.

These perfect numbers come from a formula discovered by Euclid, using Mersenne primes:
Perfect Number = 2^(p-1) * (2^p - 1)

Since LeetCode constraints guarantee the input will be within this small range,
the fastest solution is simply checking if the number is one of the known perfect
numbers. No loops or divisor checks are required.

This makes the solution extremely efficient.

Time Complexity: O(1)
Space Complexity: O(1)
*/

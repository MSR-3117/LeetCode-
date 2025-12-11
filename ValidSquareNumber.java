// Problem : Valid Perfect Square LeetCode (367)

// My Solution 

class Solution {
    public boolean isPerfectSquare(int num) {
        for (long i = 1; i * i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
}

/*
Approach:

This solution checks whether a number is a perfect square by iterating from 1 upward
and comparing i*i with the given number. The loop continues only while i*i is less than
or equal to num, ensuring we stop as soon as squaring exceeds the target. If at any point
i*i matches num exactly, we confirm that the number is a perfect square and return true.

Using long for the loop variable prevents overflow when computing i*i. This brute-force
approach is simple, direct, and works efficiently for the constraints of the problem.

Time Complexity: O(√n)
Space Complexity: O(1)
*/

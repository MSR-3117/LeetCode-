// Problem : Add Number LeetCode (258)

// My Solution 

class Solution {
    public int addDigits(int num) {
        if(num == 0)return 0 ;
        else if (num % 9 == 0) return 9 ;
        else return num % 9;
    }
}

/*
Approach:

This solution uses the mathematical concept of the digital root. Instead of repeatedly
summing digits, we leverage the modulo 9 property. The digital root of any number can be
computed in constant time using its remainder when divided by 9.

Rules applied:
- If num == 0, the result is 0.
- If num % 9 == 0, the digital root is 9.
- Otherwise, the digital root is num % 9.

Explanation:
The repeated digit-sum process preserves the modulo 9 remainder. This means the final
single-digit output is determined by num % 9. Multiples of 9 are handled separately
because their digital root is 9, not 0.

Time Complexity: O(1)
Space Complexity: O(1)
*/
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// The Optimal Solution 

// You can directly use the math computation of digital root which is --> 1+(Num -1) % 9

class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
}

/*
Approach:

This solution uses the mathematical digital root formula to compute the result without
repeated digit summation. The digital root of any positive integer can be expressed as:
    1 + (num - 1) % 9
This formula elegantly handles all cases, including multiples of 9, without requiring
conditional branches. For num == 0, the result is explicitly defined as 0.

Why it works:
The digital root is determined by the modulo 9 behavior of a number. Adjusting with
(num - 1) ensures that multiples of 9 correctly map to 9 instead of 0, which matches the
expected output for this problem.

Time Complexity: O(1)
Space Complexity: O(1)
*/

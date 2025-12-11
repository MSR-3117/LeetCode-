// Problem : Power of Two LeetCode (231)

// My Solution 

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        else if(n %2 != 0) return false;
        else{
            while (n > 1){
                if(n % 2 == 0){
                    int num = n /2;
                    n = num;
                }
                else n = 0;
            }
        }
        if (n == 1)return true;
        else return false;
    }
}

/*
Approach:

This solution checks whether a given integer is a power of two by repeatedly dividing it
by 2. If n is a power of two, it can be divided by 2 continuously until it reaches 1.
The algorithm first handles edge cases: if n == 1, return true, and if n is odd (except 1),
return false immediately. Inside the loop, n is divided by 2 as long as it remains even.
If the process ends at exactly 1, the number is a power of two.

Why this works:
Powers of two have the property that they are divisible by 2 repeatedly without producing
a fractional or odd intermediate value. Any non-power of two becomes odd at some stage or
fails the clean division process.

Time Complexity: O(log n)
Each iteration divides n by 2, resulting in logarithmic time.

Space Complexity: O(1)
Only constant extra space is used.

*/
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// The Optimal Solution 

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}

/*
Approach:

This solution uses a bitwise trick to check whether a number is a power of two.
A power-of-two number has exactly one bit set in its binary representation (e.g., 1, 2, 4, 8, 16...).
When we subtract 1 from such a number, the single set bit becomes 0 and all the lower bits become 1.

Example:
8  -> 1000
7  -> 0111  (8 - 1)
AND -> 0000

Because the single set bit never overlaps with the bits of (n - 1), the result of
(n & (n - 1)) is 0 for all powers of two.

If the number is not a power of two:
10 -> 1010
 9 -> 1001
AND -> 1000 (non-zero)

Therefore:
- If (n & (n - 1)) == 0, the number is a power of two.
- We also ensure n > 0 because zero and negative numbers are not powers of two.

Time Complexity: O(1)
Space Complexity: O(1)

*/

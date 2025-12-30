// Problem : Happy Number LeetCode (202)

// My Solution

class Solution {
    public boolean isHappy(int n) {
        if (n == 1 || n == 7) {
            return true;
        } 
        else if (n < 10) {
            return false;
        } 
        else {
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            return isHappy(sum);
        }
    }
}

/*
Approach:

A number is called a Happy Number if repeatedly replacing the number
with the sum of the squares of its digits eventually leads to 1.

Logic Breakdown:
- If the number becomes 1, it is a happy number.
- If the number becomes a single digit other than 1 or 7, it will never
  reach 1, so return false.
- Otherwise, calculate the sum of squares of digits.
- Recursively apply the same process to the new sum.

Key Observations:
- All happy numbers eventually reduce to 1.
- The number 7 is a known single-digit happy number.
- This approach avoids using extra data structures like HashSet.

Key Points:
- Uses recursion for repeated digit processing.
- No cycle detection structure is used.
- Mathematical digit extraction is applied.

Time Complexity:
- O(log n) per recursive call due to digit extraction.
- Overall complexity is bounded since values shrink quickly.

Space Complexity:
- O(log n) due to recursive call stack.

*/

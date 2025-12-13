// Problem : Plus One LeetCode (66)

// My Solution 

class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;  // represents the +1

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;

            if (carry == 0) {
                return digits;
            }
        }

        // if carry is still left after processing all digits
        int[] result = new int[digits.length + 1];
        result[0] = carry;
        return result;
    }
}

/*
Approach:

This solution increments a number represented as an array of digits without converting
the entire array into a numeric type.

Initial Insight:
The problem might seem solvable by converting the digit array into a number, adding one,
and then converting it back. However, this approach fails for very large numbers due to
integer overflow. Therefore, the addition must be simulated at the digit level.

Key Logic:
- Start from the last digit and add one.
- If the digit becomes 10, set it to 0 and carry 1 to the previous digit.
- Continue propagating the carry towards the left.
- If all digits result in 0 after carry propagation, create a new array with an extra
  leading digit set to 1.

Why this works:
This approach mimics manual addition and ensures correctness for all edge cases,
including numbers with multiple trailing 9s.

Example:
Input: [9, 9]
Steps:
    9 + 1 = 10 → write 0, carry 1
    9 + 1 = 10 → write 0, carry 1
Carry remains → create new array [1, 0, 0]

Time Complexity: O(n), where n is the number of digits
Space Complexity: O(1), excluding the output array
*/

/*
LeetCode: Add Strings

Problem Summary:
Given two non-negative integers represented as strings, return their sum as a string.
The solution must not use any built-in big integer libraries or direct integer conversion.

Approach:
- Start from the end of both strings to simulate manual addition.
- Add corresponding digits along with a carry.
- Append the result digit to a StringBuilder.
- Continue until all digits and carry are processed.
- Reverse the StringBuilder to obtain the final result.

Key Observations:
- Traversing from right to left mimics elementary addition.
- StringBuilder is efficient for building the result incrementally.
- Carry handling is crucial when the sum exceeds 9.

Complexity Analysis:
Time Complexity: O(n), where n is the length of the longer string.
Space Complexity: O(n), for storing the result.

Status:
Accepted on LeetCode
*/

class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int d1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int d2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = d1 + d2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);

            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}

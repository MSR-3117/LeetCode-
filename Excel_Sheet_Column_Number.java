// Problem : Excel Sheet Column Number LeetCode (171)

// My Solution 

class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            int value = columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + value;
        }

        return result;
    }
}

/*
Approach:

This problem converts an Excel column title into its corresponding column number.
Excel columns follow a base-26 number system using letters from A to Z.

Key Observations:
- 'A' maps to 1, 'B' to 2, ..., 'Z' to 26.
- Multi-letter columns behave like numbers in base 26.
  Example:
    "AB" = (1 * 26) + 2
    "ZY" = (26 * 26) + 25

Logic Breakdown:
- Initialize a result variable to store the computed number.
- Traverse the string from left to right.
- Convert each character to its numeric value using:
      char - 'A' + 1
- Multiply the current result by 26 to shift left (base-26 behavior).
- Add the current character value to the result.

Explanation:
At each step, the previous result represents the value of the prefix processed so far.
Multiplying by 26 makes space for the next character, and adding the current value
extends the number just like digit expansion in decimal numbers.

Example Walkthrough:
For columnTitle = "ABC"
- A → 1  → result = 0 * 26 + 1 = 1
- B → 2  → result = 1 * 26 + 2 = 28
- C → 3  → result = 28 * 26 + 3 = 731

Time Complexity: O(n), where n is the length of the column title
Space Complexity: O(1)
*/

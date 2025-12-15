// Problem : Excel Sheet Column Title LeetCode (168)

// My Solution 

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber -= 1;
            int rem = columnNumber % 26;
            sb.append((char) ('A' + rem));
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }
}

/*
Approach:

This problem converts a given column number into its corresponding Excel column title.
Excel column naming follows a base-26 system using letters A to Z, but unlike normal
base-26, it does not have a zero representation.

Key Observations:
- 'A' represents 1, 'Z' represents 26.
- After 'Z', the sequence continues as 'AA', 'AB', etc.
- Because there is no zero, we subtract 1 from the column number before processing.

Logic Breakdown:
- Reduce columnNumber by 1 to handle the lack of zero.
- Find the remainder using modulo 26 to get the current character.
- Convert the remainder to a character by adding it to 'A'.
- Append the character to a StringBuilder.
- Divide the column number by 26 to move to the next digit.
- Reverse the final string since characters are built from right to left.

Explanation:
The algorithm repeatedly extracts the least significant “digit” in base-26 form.
Subtracting 1 ensures correct mapping:
- 1 → A
- 26 → Z
- 27 → AA
Without this adjustment, the mapping would be off by one.

Time Complexity: O(log₍₂₆₎ n)
Space Complexity: O(log₍₂₆₎ n)
*/

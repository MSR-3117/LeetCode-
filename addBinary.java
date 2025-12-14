// Problem : Add Binary LeetCode (67)

// My Solution 

class Solution {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;
        StringBuilder ans = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if (i >= 0) {
                sum = sum + (a.charAt(i) - '0');
                i--;
            }

            if (j >= 0) {
                sum = sum + (b.charAt(j) - '0');
                j--;
            }

            ans.append(sum % 2);
            carry = sum / 2;
        }

        return ans.reverse().toString();
    }
}

/*
Approach:

This solution adds two binary strings by simulating manual binary addition,
without converting the strings into numeric types.

Initial Insight:
Although it may seem easier to convert binary strings into integers and add them,
this approach is unsafe for very large binary values due to overflow. Hence,
the addition must be performed digit by digit.

Key Logic:
- Traverse both binary strings from right to left.
- At each step, add the current bits along with the carry.
- The result bit is obtained using sum % 2.
- The carry is updated using sum / 2.
- Continue until all bits and carry are processed.
- Reverse the result at the end since bits are added from right to left.

Why this works:
This approach follows the same rules as manual binary addition and correctly
handles all edge cases, including different string lengths and leftover carry.

Example:
Input:
    a = "1010"
    b = "1011"

Steps:
    0 + 1 = 1 → write 1, carry 0
    1 + 1 = 2 → write 0, carry 1
    0 + 0 + 1 = 1 → write 1, carry 0
    1 + 1 = 2 → write 0, carry 1
Carry remains → write 1

Result (before reverse): 10101
Output: "10101"

Time Complexity:
O(max(n, m)), where n and m are the lengths of the input strings

Space Complexity:
O(max(n, m)), due to the StringBuilder used for the result
*/

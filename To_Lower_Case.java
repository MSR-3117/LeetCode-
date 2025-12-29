// Problem : To Lower Case (LeetCode 709)

// My Solution

class Solution {
    public String toLowerCase(String s) {
        String result = s.toLowerCase();
        return result;
    }
}
/*
Approach:

This solution converts the given string to lowercase using Java’s built-in toLowerCase() method.

The method processes each character in the string and converts any uppercase letters to their lowercase equivalents.
Since strings in Java are immutable, a new string is created and returned as the result.

This approach is simple, readable, and efficient for the given problem constraints.

Time Complexity : O(n)
Space Complexity : O(n)
*/

// Problem : Valid Parentheses LeetCode (20)
// My Solution

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (c == '[') st.push(']');
            else if (c == '{') st.push('}');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
}

/*
Approach:

This problem checks whether a given string of brackets is valid.

Instead of pushing opening brackets onto the stack, the expected closing
brackets are pushed. This allows direct comparison when a closing bracket
is encountered.

Logic:
- Traverse each character in the string.
- Push the expected closing bracket for every opening bracket.
- If a closing bracket appears, check whether it matches the stack top.
- If the stack is empty or a mismatch occurs, return false.
- At the end, the stack must be empty for the string to be valid.

Time Complexity:
O(n), where n is the length of the string.

Space Complexity:
O(n), for the stack in the worst case.
*/

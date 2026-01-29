// Problem : Longest Common Prefix LeetCode (14)

// My Solution

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s = "";
        int i = 0;
        int length = strs.length;

        while (i < strs[0].length()) {
            if (strs[0].charAt(i) == strs[length - 1].charAt(i))
                s += strs[0].charAt(i);
            else
                break;
            i++;
        }

        return s;
    }
}

/*
Approach:

This solution finds the longest common prefix among an array of strings by
using sorting and character-by-character comparison.

Initial Insight:
When the array of strings is sorted lexicographically, the longest common
prefix of the entire array must be the common prefix between:
- the first string, and
- the last string.

This works because these two strings are the most different in the sorted order.
Any prefix common to both will be common to all strings in between.

Key Logic:
- Sort the array of strings.
- Compare characters of the first and last strings.
- Continue while characters match.
- Stop when a mismatch occurs.
- Accumulate matching characters as the prefix.

Why this works:
Sorting places strings with similar prefixes closer together. The maximum
possible difference appears between the first and last strings, so their
common prefix represents the global longest common prefix.

Example:
Input: ["flower", "flow", "flight"]
Sorted: ["flight", "flow", "flower"]

Comparison:
f == f → add 'f'
l == l → add 'l'
i != o → stop

Output: "fl"

Another Example:
Input: ["dog", "racecar", "car"]
Sorted: ["car", "dog", "racecar"]
First characters do not match → return ""

Time Complexity:
O(n log n + m), where:
- n = number of strings
- m = length of the shortest string

Space Complexity:
O(1), excluding sorting internals and output string
*/

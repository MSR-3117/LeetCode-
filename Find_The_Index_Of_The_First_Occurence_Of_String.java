/*
Problem: Find the Index of the First Occurrence in a String (LeetCode 28)

Approach:
The task is to find the first index where the string "needle"
appears as a substring inside the string "haystack".

A sliding window technique is used by comparing substrings of length
equal to the needle across the haystack.

Algorithm:
1. Iterate over the haystack using two pointers i and j.
2. Maintain a window of size equal to the length of needle.
3. At each step, extract the substring from index i to j.
4. If the substring matches needle, return index i.
5. If no match is found after traversal, return -1.

Why This Works:
- The window size always matches the needle length.
- Every possible starting index is checked exactly once.
- The first match is returned immediately.

Time Complexity:
O(n * m), where n is the length of haystack and m is the length of needle,
due to substring comparison.

Space Complexity:
O(1), ignoring the temporary substring object.
*/

class Solution {
    public int strStr(String haystack, String needle) {

        // Iterate using a sliding window of needle length
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {

            // Check if current substring matches needle
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }

        // Return -1 if needle is not found
        return -1;
    }
}

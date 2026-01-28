// Problem : Valid Palindrome (LeetCode 125)

// My Solution

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/*
Approach:

1. Convert the string to lowercase to handle case-insensitive comparison.
2. Remove all non-alphanumeric characters using regex.
3. Use two pointers starting from both ends of the string.
4. Compare characters while moving inward.
5. If any mismatch occurs, return false.
6. If all characters match, return true.

Time Complexity: O(n)
Space Complexity: O(n)
*/

// Problem : Reverse String (LeetCode 344)

// My Solution

class Solution {
    public void reverseString(char[] s) {

        ArrayList<Character> list = new ArrayList<>();

        for (int i = s.length - 1; i >= 0; i--) {
            list.add(s[i]);
        }

        for (int i = 0; i < s.length; i++) {
            s[i] = list.get(i);
        }
    }
}
/*
Approach:

This solution reverses the given character array using an auxiliary ArrayList.

The characters are first traversed from the end of the array and stored in reverse order.
The reversed characters are then copied back into the original array to produce the required output.

This approach focuses on simplicity and correctness while maintaining linear time complexity.

Time Complexity : O(n)
Space Complexity : O(n)
*/

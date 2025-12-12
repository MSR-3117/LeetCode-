// Problem : Roman to Integer LeetCode (13)

// My Solution 

class Solution {
    public int romanToInt(String s) {
        Map<Character , Integer> map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));
            if (i + 1 < s.length() && current < map.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }
}

/*
Approach:

This solution converts a Roman numeral string into an integer using a HashMap to store
each Roman symbol with its corresponding value.

Key Logic:
- Traverse each character from left to right.
- Compare the current symbol value with the next symbol value.
- If the current value is smaller than the next value, subtract it.
- Otherwise, add it to the result.

Why subtraction works:
Roman numerals use a special subtractive rule in cases like:
    IV = 4  (5 - 1)
    IX = 9  (10 - 1)
By checking the next symbol, we know when subtraction is required.

Example:
Input: "MCMXCIV"
Steps: 1000 + (100 subtracted) + 1000 + (10 subtracted) + 100 + (1 subtracted) + 5

Time Complexity: O(n)
Space Complexity: O(1) — only 7 fixed map entries
*/

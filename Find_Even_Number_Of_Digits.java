// Problem : Even Number of Digits LeetCode (1295)

// My Solution

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }

        return count;
    }

    static boolean hasEvenDigits(int num) {
        int digits = 0;

        while (num > 0) {
            digits++;
            num /= 10;
        }

        return digits % 2 == 0;
    }
}

/*
Approach:

The goal of this problem is to count how many numbers in the given array
contain an even number of digits.

Logic Breakdown:
- Traverse through each element in the array.
- For every number, count how many digits it has.
- If the digit count is even, increment the result counter.

Digit Counting:
- Repeatedly divide the number by 10.
- Each division removes one digit.
- Count how many times this operation runs.

Key Points:
- No conversion to string is used.
- Digit count is computed mathematically.
- A helper function improves readability and separation of logic.

Time Complexity:
- O(n × d), where n is the number of elements and d is the number of digits.

Space Complexity:
- O(1), since only constant extra space is used.

*/

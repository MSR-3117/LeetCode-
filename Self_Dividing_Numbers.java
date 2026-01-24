/*
LeetCode: Self Dividing Numbers

Problem Summary:
A self-dividing number is a number that is divisible by every digit it contains
and does not contain the digit zero.
Given two integers left and right, return a list of all self-dividing numbers
in this range.

Approach:
- Iterate through each number in the given range.
- Extract digits one by one using modulo and division.
- Check that each digit is non-zero and divides the original number evenly.
- If all digits satisfy the condition, add the number to the result list.

Key Observations:
- Presence of digit zero automatically disqualifies the number.
- Digit extraction using % 10 and / 10 is efficient and simple.
- Count comparison ensures all digits meet the condition.

Complexity Analysis:
Time Complexity: O(n × d), where d is the number of digits.
Space Complexity: O(1) (excluding output list).

Status:
Accepted on LeetCode
*/

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int temp = i;
            int num = i;
            int count = 0, validCount = 0;

            while (num > 0) {
                int digit = num % 10;
                count++;

                if (digit != 0 && temp % digit == 0) {
                    validCount++;
                }

                num /= 10;
            }

            if (count == validCount) {
                list.add(temp);
            }
        }

        return list;
    }
}

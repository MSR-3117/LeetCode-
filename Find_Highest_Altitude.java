// Problem : Find the Highest Altitude (LeetCode)

// My Solution

class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int temp = 0;

        for (int i = 0; i < gain.length; i++) {
            temp = temp + gain[i];
            if (temp > sum) {
                sum = temp;
            }
        }
        return sum;
    }
}

/*
Approach:

We start at altitude 0 and are given an array where each element represents
the change in altitude between consecutive points.

Logic:
- Use a variable `temp` to maintain the current altitude (prefix sum).
- Use another variable `sum` to store the maximum altitude reached so far.
- Traverse the array once, updating the current altitude and maximum value.

Key Points:
- Starting altitude is considered as 0.
- Negative gains do not affect the maximum unless a higher altitude is reached.
- The solution uses a single pass for efficiency.

Time Complexity:
O(n), where n is the length of the gain array.

Space Complexity:
O(1), since only constant extra space is used.
*/

// Problem : Missing Number (LeetCode 268)

// My Solution

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int news = 0;

        for (int i = 0; i < nums.length; i++) {
            news += nums[i];
        }

        return sum - news;
    }
}
/*
Approach:

This solution uses a mathematical approach to find the missing number from the given array.

The expected sum of numbers from 0 to n is calculated using the formula n * (n + 1) / 2.
Then, the actual sum of elements present in the array is computed by traversing the array once.

The difference between the expected sum and the actual sum gives the missing number.

This approach avoids sorting and additional data structures, making it efficient and easy to understand.

Time Complexity : O(n)
Space Complexity : O(1)
*/

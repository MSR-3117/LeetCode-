/*
LeetCode: Maximum Product of Three Numbers

Problem Overview:
Given an integer array nums, find the maximum product of any three numbers.

Key Insight:
The maximum product can be obtained in two possible ways:
1) Product of the three largest numbers
2) Product of the largest number and the two smallest (most negative) numbers

Reason:
Two negative numbers multiplied together result in a positive number, which can
outweigh the product of three positive numbers.

Approach:
- Iterate through the array once
- Track the three largest values (max1, max2, max3)
- Track the two smallest values (min1, min2)
- Return the maximum of the two possible products

Complexity:
Time Complexity: O(n)
Space Complexity: O(1)

Key Takeaway:
Always consider negative values when maximizing a product.
*/

class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int n : nums) {

            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }

        return Math.max(max1 * max2 * max3, max1 * min1 * min2);
    }
}

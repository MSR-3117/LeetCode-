// Problem : Subtract the Product and Sum of Digits of an Integer LeetCode (1281)

// My Solution

class Solution {
    public int subtractProductAndSum(int n) {
        int product_final = findProduct(n);
        int sum_final = findSum(n);
        return product_final - sum_final;
    }

    static int findProduct(int n) {
        int product = 1;
        while (n > 0) {
            int s = n % 10;
            product = product * s;
            n = n / 10;
        }
        return product;
    }

    static int findSum(int n) {
        int sum = 0;
        while (n > 0) {
            int s = n % 10;
            sum = sum + s;
            n = n / 10;
        }
        return sum;
    }
}

/*
Approach:

This problem requires computing the difference between the product and
the sum of the digits of a given integer.

Logic Breakdown:
- Extract digits one by one using modulo 10.
- Maintain a running product of digits.
- Maintain a running sum of digits.
- Subtract the final sum from the final product.

Design Choice:
- Used separate helper methods for product and sum to keep the logic clean
  and readable.

Time Complexity: O(d), where d is the number of digits
Space Complexity: O(1)
*/

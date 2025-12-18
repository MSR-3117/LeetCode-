// Problem : Richest Customer Wealth LeetCode (1672)

// My Solution

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int row = 0; row < accounts.length; row++) {
            int currentWealth = 0;

            for (int col = 0; col < accounts[row].length; col++) {
                currentWealth += accounts[row][col];
            }

            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }

        return maxWealth;
    }
}

/*
Approach:

Each row in the 2D array represents a customer, and each column represents
the amount of money that customer has in a particular bank.

The task is to find the customer whose total wealth is the maximum.

Logic Breakdown:
- Iterate through each customer (row).
- Calculate the sum of all bank balances for that customer.
- Compare the current sum with the maximum wealth found so far.
- Update the maximum if the current customer's wealth is higher.

Key Points:
- Wealth is calculated row by row.
- The sum variable is reset for each customer.
- No extra data structures are used.

Time Complexity:
- O(m × n), where m is the number of customers and n is the number of banks.

Space Complexity:
- O(1), since only constant extra space is used.

*/

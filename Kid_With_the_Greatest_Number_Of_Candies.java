// Problem : Kids With the Greatest Number of Candies LeetCode (1431)

// My Solution

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int high = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > high) {
                high = candies[i];
            }
        }
        return checkTrue(candies, extraCandies, high);
    }

    public List<Boolean> checkTrue(int[] candies, int extraCandies, int high) {
        List<Boolean> check = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            int temp = candies[i] + extraCandies;
            if (temp >= high) {
                check.add(true);
            } else {
                check.add(false);
            }
        }
        return check;
    }
}

/*
Approach:

The problem asks whether each child can have the greatest number of candies
after receiving extra candies.

Logic Breakdown:
- First, find the maximum number of candies any child currently has.
- For each child, add extraCandies to their current count.
- If the updated count is greater than or equal to the maximum, mark true.
- Otherwise, mark false.

Design Choice:
- Separated the logic into two methods for clarity and readability.
- Used a Boolean list to store results for each child.

Time Complexity: O(n)
Space Complexity: O(n)
*/

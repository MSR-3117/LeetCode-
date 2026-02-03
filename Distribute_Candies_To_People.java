// Problem : Distribute Candies to People LeetCode (1103)

// My Solution

class Solution { 

    private void findnum(int can, int peo, int[] res, int count) {
        while (can > 0) {
            for (int i = 0; i < peo; i++) {
                if (can >= count) {
                    res[i] += count;
                    can -= count;
                    count++;
                } else {
                    res[i] += can;
                    return;
                }
            }
        }
    }

    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        findnum(candies, num_people, res, 1);
        return res;
    }
}

/*
Approach:

The problem simulates distributing candies to people in increasing order,
starting from 1 candy and increasing by 1 each time.

Logic Breakdown:
- Maintain a variable `count` to track the number of candies to distribute.
- Distribute candies in rounds across all people.
- If remaining candies are less than `count`, give all remaining candies
  to the current person and stop.
- Continue until all candies are distributed.

Design Choices:
- Used a helper method to separate distribution logic.
- Handled edge cases where remaining candies are less than required.
- Direct simulation keeps the logic simple and readable.

Time Complexity: O(c), where c is the number of candy distributions
Space Complexity: O(n), where n is the number of people
*/

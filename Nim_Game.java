/*
Problem: 292. Nim Game (LeetCode)

Approach:
- In the Nim Game, players can remove 1, 2, or 3 stones on each turn.
- The player who removes the last stone wins.
- If the number of stones is a multiple of 4, the first player will always lose
  assuming both players play optimally.
- For any other number, the first player can force a win.

Logic:
- If n % 4 != 0 → winning position
- If n % 4 == 0 → losing position

Complexity:
- Time Complexity: O(1)
- Space Complexity: O(1)
*/

class Solution {
    public boolean canWinNim(int n) {
        if (n % 4 != 0)
            return true;
        else
            return false;
    }
}

// Problem : Shuffle the Array LeetCode (1470)

// My Solution

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
}

/*
Approach:

The array is divided into two halves:
- First half:  x1, x2, ..., xn
- Second half: y1, y2, ..., yn

The task is to rearrange the array into the order:
x1, y1, x2, y2, ..., xn, yn.

Logic Breakdown:
- Create a new array of size 2n.
- Traverse the first half using index i.
- Place nums[i] at index 2*i.
- Place nums[i + n] at index 2*i + 1.

Time Complexity: O(n)
Space Complexity: O(n)
*/

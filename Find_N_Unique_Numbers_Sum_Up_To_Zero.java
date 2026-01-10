/*
Problem: Find N Unique Integers Sum up to Zero (LeetCode)

Approach:
- The goal is to construct an array of n unique integers whose sum equals zero.
- To achieve this, we use a symmetric pairing technique.
- For every positive integer i, we include both i and -i in the array.
- If n is odd, we include 0 once to maintain uniqueness and ensure the total count.

Algorithm:
1. Initialize an integer array of size n.
2. Use an index pointer to keep track of positions.
3. If n is odd, place 0 in the array first.
4. Loop from 1 to n/2 and insert i and -i into the array.
5. Return the constructed array.

Key Observations:
- Pairing i and -i always results in a sum of zero.
- Including 0 handles the odd-length case cleanly.
- All integers in the array remain unique.

Complexity Analysis:
- Time Complexity: O(n)
- Space Complexity: O(n)

Author: M. S. Rahman
*/

class Solution {
    public int[] sumZero(int n) {
        int[] a = new int[n];
        int idx = 0;

        if (n % 2 != 0) {
            a[idx++] = 0;
        }

        for (int i = 1; i <= n / 2; i++) {
            a[idx++] = i;
            a[idx++] = -i;
        }

        return a;
    }
}

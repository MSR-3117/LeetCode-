// Problem : Find Smallest Letter Greater Than Target (LeetCode 744)

// My Solution

class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return arr[start % arr.length];
    }
}

/*
Approach:

This problem is a classic application of binary search on a sorted array.
The goal is to find the smallest character that is strictly greater than the
given target.

Key Observations:
- The array is sorted in ascending order.
- If the target is smaller than some characters, the answer lies on the left side.
- If the target is greater than or equal to all characters, the search goes out
  of bounds and we wrap around to the first element.

Logic Breakdown:
- Use binary search to narrow down the search space.
- If arr[mid] > target, it is a valid candidate, so move left to find a smaller one.
- Otherwise, move right to look for a greater character.
- After the loop, `start` points to the smallest index where the character
  is greater than the target.

Wrap-Around Handling:
- If the target is greater than or equal to all characters in the array,
  `start` becomes equal to arr.length.
- Using `start % arr.length` ensures we return the first character in the array.

Time Complexity:
- O(log n), where n is the length of the array.

Space Complexity:
- O(1), as no extra space is used.
*/

// Problem : Search Insert Position LeetCode (35)

// My Solution

class Solution {
    public int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } 
            else if (arr[mid] < target) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return start;
    }
}

/*
Approach:

This problem asks for the index where the target element should be inserted
in a sorted array to maintain the sorted order.

Key Logic:
- Use binary search since the array is already sorted.
- If the target is found, return its index directly.
- If the target is not found, the loop ends when start crosses end.
- At that point, start represents the correct insertion index.

Why returning start works:
- All elements before start are smaller than the target.
- All elements after start are greater than the target.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

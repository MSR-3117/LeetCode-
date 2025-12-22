// Problem : Find Peak Element — LeetCode (162)

// My Solution

class Solution {
    public int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}

/*
Approach:

This solution uses Binary Search to find a peak element efficiently.
A peak element is an element that is strictly greater than its neighbors.

Key Observations:
- If arr[mid] < arr[mid + 1], then a peak must exist on the right side.
- Otherwise, a peak exists on the left side or at mid itself.
- The array boundaries act as negative infinity, ensuring at least one peak.

Logic Breakdown:
- Initialize start and end pointers.
- Use binary search to compare mid with mid + 1.
- Move towards the direction that guarantees a peak.
- Loop ends when start == end, which points to a peak index.

Time Complexity:
O(log n)

Space Complexity:
O(1)

This approach avoids linear scanning and efficiently finds any valid peak element.
*/

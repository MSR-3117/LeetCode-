// Problem : Peak Index in a Mountain Array (LeetCode 852)

// My Solution

class Solution {
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int high = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                high = mid + 1;
                start = mid + 1;
            } else {
                high = mid;
                end = mid - 1;
            }
        }
        return high;
    }
}
/*
Approach:

This problem involves finding the peak element in a mountain array, where the values
strictly increase up to a peak and then strictly decrease.

Instead of scanning the entire array linearly, a binary search approach is used to
achieve optimal performance.

Key Logic:
- Use binary search to reduce the search space.
- Compare the middle element with its next element.
- If arr[mid] < arr[mid + 1], the array is in the ascending phase, so the peak lies on the right.
- If arr[mid] > arr[mid + 1], the array is in the descending phase, so the peak lies at mid or to the left.
- Update the search boundaries accordingly.

The variable `high` is updated to track the possible peak index during the search.

Time Complexity:
- O(log n), since the search space is halved each iteration.

Space Complexity:
- O(1), as no extra space is used.

This approach efficiently identifies the peak index while maintaining clean and structured logic.
*/

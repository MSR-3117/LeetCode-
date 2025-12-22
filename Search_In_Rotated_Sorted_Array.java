// Problem : Search in Rotated Sorted Array — LeetCode (33)

// My Solution

class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == 0) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }
        if (target >= nums[0]) {
            return binarySearch(nums, 0, pivot - 1, target);
        }
        return binarySearch(nums, pivot, nums.length - 1, target);
    }
    static int findPivot(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}

/*
Approach:

This problem requires searching an element in a rotated sorted array in O(log n) time.

Key Observations:
- A rotated sorted array consists of two individually sorted subarrays.
- The rotation point (pivot) is the index of the smallest element.
- Once the pivot is found, normal binary search can be applied on the correct half.

Logic Breakdown:
- First, find the pivot using binary search.
- Decide which half of the array the target belongs to.
- Apply binary search on that half.

Time Complexity:
O(log n)

Space Complexity:
O(1)

This approach maintains logarithmic efficiency while handling rotation correctly.
*/

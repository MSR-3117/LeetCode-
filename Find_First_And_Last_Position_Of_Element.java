// Problem : Find First and Last Position of Element in Sorted Array (LeetCode 34)

// My Solution

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] final_ans = {-1, -1};

        int first = first_occ(nums, target);
        int last = last_occ(nums, target);

        final_ans[0] = first;
        final_ans[1] = last;

        return final_ans;
    }

    static int first_occ(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;   // move left to find first occurrence
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static int last_occ(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;  // move right to find last occurrence
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}

/*
Approach:

This solution finds the first and last occurrence of a target value in a sorted array
using binary search.

Key Idea:
Instead of scanning linearly, binary search is used twice:
- One search to find the first occurrence
- Another search to find the last occurrence

First Occurrence Logic:
- When the target is found, store the index
- Continue searching on the left side to check if the target appears earlier

Last Occurrence Logic:
- When the target is found, store the index
- Continue searching on the right side to check if the target appears later

This ensures both positions are found efficiently without extra space.

Time Complexity:
O(log n) for each binary search

Space Complexity:
O(1)

This approach is optimal and leverages the sorted nature of the array effectively.
*/

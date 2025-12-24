// Problem : Single Element in a Sorted Array LeetCode (540)

// My Solution

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int n = nums.length - 1;
        int mid = 0;

        if (n == 0) return nums[0];

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[0] != nums[1]) return nums[0];
            if (nums[n] != nums[n - 1]) return nums[n];

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) ||
                (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

/*
Approach:

This problem involves finding the single non-duplicate element in a sorted array
where every other element appears exactly twice.

Key Observations:
- Pairs of identical elements occupy even–odd index positions before the single element.
- After the single element, this pairing pattern breaks.
- This property allows binary search to be applied.

Logic Breakdown:
- Handle edge cases where the single element is at the beginning or end.
- Check if the middle element is unique by comparing neighbors.
- Use index parity (even/odd) to decide which half to discard.
- Reduce the search space until the single element is found.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

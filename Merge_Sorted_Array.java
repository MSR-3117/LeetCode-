/*
Problem: Merge Sorted Array (LeetCode 88)

Approach:
The first array nums1 has enough extra space at the end to hold all elements of nums2.
We start by copying all elements from nums2 into the empty positions of nums1.
After combining both arrays, we sort nums1 to maintain non-decreasing order.

This approach prioritizes simplicity and clarity over optimal time complexity.

Steps:
1. Start inserting elements of nums2 from index m in nums1
2. Once all elements are copied, sort nums1
3. Since the problem asks for in-place modification, no extra array is used

Complexity Analysis:
Time Complexity: O((m + n) log (m + n))
Space Complexity: O(1) (in-place, ignoring sorting internals)

Notes:
- This solution is straightforward and easy to understand
- More optimal solutions exist using a three-pointer approach
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m;
        for (int j = 0; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }

        Arrays.sort(nums1);
    }
}

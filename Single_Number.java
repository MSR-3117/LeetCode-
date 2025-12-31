// Problem : Single Number
// LeetCode (136)

// My Solution

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        if (nums.length == 1) return nums[0];

        if (nums[0] != nums[1]) return nums[0];

        if (nums[nums.length - 1] != nums[nums.length - 2])
            return nums[nums.length - 1];

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1])
                return nums[i];
        }

        return -1;
    }
}

/*
Approach:

In this problem, every element appears twice except for one element that appears only once.
The idea is to first sort the array so that duplicate elements become adjacent.

Key Observations:
- After sorting, identical elements will be next to each other.
- The single element will differ from both its neighboring elements.
- Edge cases must be handled separately since the first and last elements
  have only one neighbor.

Logic Breakdown:
- Sort the array to group duplicate elements together.
- If the array contains only one element, return it directly.
- Check the first two elements; if they are different, the first element is unique.
- Check the last two elements; if they are different, the last element is unique.
- Traverse the array from index 1 to n−2 and find the element that is not equal
  to both its previous and next elements.

Explanation:
Sorting simplifies the problem by arranging duplicates together.
By comparing each element with its neighbors, the element that does not have
a matching pair can be easily identified.

Example:
For nums = [4, 1, 2, 1, 2]
After sorting → [1, 1, 2, 2, 4]
The element 4 does not match its neighbors, so it is the single number.

Time Complexity: O(n log n), due to sorting
Space Complexity: O(1), no extra space used
*/

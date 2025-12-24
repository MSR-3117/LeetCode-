// Problem : How Many Numbers Are Smaller Than the Current Number LeetCode (1365)

// My Solution

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int[] count = new int[101];

        // Count frequency of each number
        for (int num : nums) {
            count[num]++;
        }

        // For each element, count how many numbers are smaller than it
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i]; j++) {
                ans[i] += count[j];
            }
        }
        return ans;
    }
}

/*
Approach:

This solution uses a counting-based technique to avoid comparing each element
with every other element.

Logic Breakdown:
- The constraints limit numbers to the range 0–100, allowing the use of a
  frequency array.
- First, store how many times each number appears.
- For each element nums[i], sum the frequencies of all numbers smaller than it.
- Store the result in the answer array.

Why this works:
- Instead of scanning the entire array for each element, we leverage the
  limited value range.
- This significantly reduces unnecessary comparisons.

Time Complexity: O(n × k), where k = 100 (constant)
Space Complexity: O(1) (constant extra space)
*/

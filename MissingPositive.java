 /*
    LeetCode Problem: First Missing Positive

    Approach:
    This problem is solved using the Cyclic Sort pattern.

    Core Idea:
    - For an array of size n, the smallest missing positive integer
      must lie in the range [1, n + 1].
    - We try to place every positive number x (where 1 ≤ x ≤ n)
      at its correct index x - 1.
    - After rearrangement, the first index i where nums[i] != i + 1
      gives the missing positive number.

    Steps:
    1. Iterate through the array and place each valid number
       at its correct position using swapping.
    2. Ignore numbers that are negative, zero, or greater than array length.
    3. After rearranging, scan the array to find the first mismatch.
    4. If all numbers are in correct positions, the answer is n + 1.

    Why this works:
    - Each number is moved at most once to its correct index.
    - No extra space is used apart from a few variables.

    Time Complexity:
    O(n) — Each element is visited a constant number of times.

    Space Complexity:
    O(1) — In-place algorithm with constant extra space.
    */
class Solution{
    public int firstMissingPositive(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] > 0 &&
                nums[i] <= nums.length &&
                nums[i] != nums[correct]) {

                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Find the first index where value is incorrect
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        // If all numbers are placed correctly
        return nums.length + 1;
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

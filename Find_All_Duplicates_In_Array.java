/*
Find All Duplicates in an Array (LeetCode)

Problem Statement

Given an integer array where numbers are in the range 1 to n (inclusive), find all elements that appear exactly twice.
The solution must run in linear time and use constant extra space.

⸻

Approach (Cyclic Sort)
	•	Iterate through the array and place each number at its correct index (value - 1).
	•	If a number is already present at its correct position, move forward.
	•	After rearranging, any index that does not contain index + 1 represents a duplicate value.
	•	Collect such values into the result list.

This approach efficiently leverages index mapping without using extra space.
*/
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
/*
Complexity Analysis
	•	Time Complexity: O(n)
	•	Space Complexity: O(1) (excluding the output list)

⸻

Key Takeaways
	•	Cyclic Sort is highly effective for problems involving numbers in a fixed range
	•	In-place swaps help achieve constant space optimization
	•	Pattern applies to multiple array-based LeetCode problems
  */

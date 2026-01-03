/*
Find the Duplicate Number (LeetCode 287)

Problem Statement

Given an integer array arr containing n + 1 integers where each integer is in the range 1 to n inclusive, there is only one repeated number.
Return the duplicate number without modifying the array structure unnecessarily and using constant extra space.

⸻

Approach (Cyclic Sort)
	•	Since the numbers are in the range 1 to n, each number ideally belongs at index value - 1.
	•	Use Cyclic Sort to place elements at their correct indices.
	•	While sorting:
	•	If a number is already present at its correct index, it indicates a duplicate.
	•	Return that number immediately.
	•	This avoids extra data structures and keeps the solution efficient.

⸻

Algorithm
	1.	Start iterating through the array from index 0.
	2.	If the current element is not at its correct index:
	•	Calculate its correct index as value - 1.
	•	If the correct index already contains the same value, return it as the duplicate.
	•	Otherwise, swap the elements.
	3.	If the element is already at the correct index, move to the next index.
	4.	If no duplicate is found during sorting, return -1.
*/
class Solution {
    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
/*
Time and Space Complexity

Time Complexity: O(n)
Space Complexity: O(1)
  */

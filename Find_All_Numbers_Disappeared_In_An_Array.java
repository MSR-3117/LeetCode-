/*
Find All Numbers Disappeared in an Array (LeetCode 448)

Problem Statement

Given an integer array nums of length n where each element is in the range 1 to n, some elements appear twice and others appear once.
Return all the integers in the range 1 to n that do not appear in the array.

Approach (Cyclic Sort)

Since all numbers lie in the range 1 to n, each value ideally belongs at index value - 1.
Cyclic Sort is used to place each element at its correct index by swapping until the correct position is reached or a duplicate value prevents further swapping.

After rearranging the array, a linear scan is performed.
If at any index i, the value is not equal to i + 1, then i + 1 is missing and is added to the result list.

Algorithm
	1.	Iterate through the array and place each element at its correct index using cyclic swapping.
	2.	Skip swapping when the current element is already at its correct position or a duplicate is encountered.
	3.	Traverse the array after sorting.
	4.	For every index where nums[i] != i + 1, add i + 1 to the result list.
	5.	Return the list of missing numbers.
*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(i + 1);
            }
        }
        return list;
    }

    void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
/*
Time and Space Complexity

Time Complexity: O(n)
Space Complexity: O(1) (excluding the output list)
  */

class Solution {

    /*
    Problem: Set Mismatch (LeetCode 645)

    Problem Statement:
    You are given an array containing numbers from 1 to n.
    One number appears twice (duplicate) and one number is missing.
    Return an array containing the duplicate number and the missing number.

    Approach: Cyclic Sort
    - Traverse the array and place each number at its correct index (value - 1).
    - If the current number is already at its correct position, move forward.
    - After rearranging, the index where arr[index] != index + 1 indicates:
        * arr[index]  -> duplicate number
        * index + 1   -> missing number

    Why Cyclic Sort:
    - Numbers are in the fixed range 1 to n.
    - Allows in-place rearrangement.
    - Avoids using extra space.

    Time Complexity:
    O(n)

    Space Complexity:
    O(1) (excluding the output array)

    Key Takeaways:
    - Cyclic Sort is powerful for range-based array problems.
    - Index-value mapping helps detect anomalies efficiently.
    - This pattern is reusable across many LeetCode problems.
    */

    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[]{arr[index], index + 1};
            }
        }

        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

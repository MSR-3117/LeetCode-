// Problem : Create Target Array in the Given Order (LeetCode 1389)

// My Solution

class Solution {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}

/*
Approach:

This problem requires constructing a target array by inserting elements from the nums array
at specific positions defined by the index array.

Key Idea:
- Use an ArrayList because it supports insertion at a given index.
- When an element is inserted, existing elements are automatically shifted to the right.

Logic Breakdown:
- Iterate through nums and index simultaneously.
- Insert nums[i] at position index[i] in the ArrayList.
- After all insertions, convert the ArrayList into an integer array.

Why ArrayList?
- Dynamic resizing
- Built-in index-based insertion
- Simplifies shifting logic

Time Complexity:
- O(n²) in the worst case due to shifting during insertions.

Space Complexity:
- O(n) for the ArrayList and result array.

This solution directly follows the problem constraints and is easy to understand and implement.
*/

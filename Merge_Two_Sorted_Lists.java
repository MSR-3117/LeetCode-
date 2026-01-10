/*
Problem: Merge Two Sorted Lists (LeetCode)

Approach:
- The task is to merge two sorted singly linked lists into one sorted list.
- A recursive approach is used to compare nodes from both lists.
- At each step, the smaller value node is selected and linked to the result.

Algorithm:
1. If both lists are non-null, compare their current node values.
2. Recursively call the function with the next node of the list having the smaller value.
3. Link the returned node to the current smaller node.
4. If one list becomes null, return the remaining nodes of the other list.
5. Continue until both lists are fully merged.

Key Observations:
- Since the input lists are already sorted, only value comparison is required.
- Recursion naturally preserves the sorted order.
- The merge is done in-place without using extra data structures.

Complexity Analysis:
- Time Complexity: O(n + m), where n and m are the lengths of the two lists.
- Space Complexity: O(n + m) due to recursive call stack.

Author: M. S. Rahman
*/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }

        if (list1 == null)
            return list2;

        return list1;
    }
}

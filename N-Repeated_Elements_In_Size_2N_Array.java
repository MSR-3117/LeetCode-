//Problem: N-Repeated Element in Size 2N Array (LeetCode 961)

//My Solution:

class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length - 2;
        for(int i = 0; i < n; i++) {
            if(nums[i] == nums[i + 1] || nums[i] == nums[i + 2]) 
                return nums[i];
        }
        return nums[n + 1];
    }
}

/*
Approach :
The array has a length of 2N, where exactly one element is repeated N times. This repeated element must appear at least twice within any three consecutive elements. 
The algorithm iterates through the array and compares the current element with the next one and the element after that. If a match is found, the repeated element 
is returned immediately. If no match is found during iteration, the repeated element must be positioned near the end of the array, so the last element is returned.

Time Complexity: O(n)
Space Complexity: O(1)
*/

// Problem: Fibonacci Number (LeetCode 509)

class Solution {
    public int fib(int n) {
        int p = 0; // first value starting from 0
        int q = 1; // second value starting from 1 
        int count = 0;// 
        while(count < n){
            int temp = q;
            q = q + p;
            p = temp;
            count++;
        }
        return p;
    }
}

/*
My Insights

This solution uses an iterative approach to compute the nth Fibonacci number.
The variables p and q represent consecutive Fibonacci values, starting from 0 and 1.
A temp variable is used to temporarily store the previous value while updating both variables each iteration.

In every loop:
	•	q becomes the next Fibonacci number
	•	p shifts to the previous q
	•	count tracks how many updates have been made

The sequence progresses efficiently with constant space since only two variables are maintained throughout.

Time Complexity: O(n)
Space Complexity: O(1)

*/

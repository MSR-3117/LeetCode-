/*
LeetCode: Fizz Buzz

Problem:
Given an integer n, return a string array answer (1-indexed) where:
- answer[i] == "FizzBuzz" if i is divisible by 3 and 5
- answer[i] == "Fizz" if i is divisible by 3
- answer[i] == "Buzz" if i is divisible by 5
- answer[i] == i (as a string) otherwise

Approach:
- Iterate from 1 to n.
- Use modulo checks to determine divisibility.
- Check divisibility by both 3 and 5 first (i % 15 == 0) to avoid overlap.
- Append the appropriate string to the result list.

Key Insight:
- Order of conditions matters.
- Using i % 15 simplifies checking for both 3 and 5.

Time Complexity:
O(n) — single pass through numbers from 1 to n.

Space Complexity:
O(n) — to store the result list.
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(String.valueOf(i));
            }
        }

        return res;        
    }
}

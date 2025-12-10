// Problem : Palindrome Number  LeetCode Problem (9)
// My Solution 

class Solution {
    public boolean isPalindrome(int x) {
        int check = x;
        int reverse = 0;
        while (x > 0){
            int temp = x % 10;
            reverse = reverse*10 + temp;
            x=x/10;
        }
        if(check == reverse){
            return true;
        }
        else{
            return false;
        }
    }
}

/*
My Approach:
I convert the given integer into its reversed form and then compare it with the original value.
The variable 'check' stores the original number. Inside the loop, I extract digits using x % 10
and build the reversed number by multiplying the existing reverse value by 10 and adding the new digit.
The original number x is reduced digit by digit using x / 10 until all digits are processed.

This approach works because a number is a palindrome only if reading it forward and backward results
in the same value. By reconstructing the reversed number mathematically (without converting to a string),
we ensure an efficient and space-constant solution.

Time Complexity:
O(d), where d is the number of digits in x. In each iteration, one digit is removed (x = x / 10),
so the loop runs once per digit. This is equivalent to O(log₁₀(x)).

Space Complexity:
O(1). Only a fixed number of integer variables are used (check, reverse, temp), regardless of input size.
*/
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// The Optimal Solution 

class Solution {

    public boolean isPalindrome(int x) {
        String original = String.valueOf(x);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

/*
This solution checks whether an integer is a palindrome by converting it into a string.
The value x is transformed into a string using String.valueOf(x), and the reversed version
is obtained using StringBuilder's reverse() operation. If both strings match, the number
is a palindrome.

This avoids manual digit extraction and makes use of Java's built-in string operations.
Although not as optimal in memory as the mathematical approach, it is clean, concise,
and works effectively for this problem.

Time Complexity:
O(n), where n is the number of digits. Converting to a string and reversing both take linear time.

Space Complexity:
O(n), because creating the string and its reversed copy both require additional memory.

*/

// Problem : Check if the Sentence Is Pangram (LeetCode 1832)

// Approach 1 : ArrayList Based Solution

import java.util.*;

class Solution {

    public static boolean checkIfPangram(String sentence){
        ArrayList<Character> list = new ArrayList<>();
        int count = 0;

        // add all alphabets to the list
        for(char ch = 'a'; ch <= 'z'; ch++){
            list.add(ch);
        }

        // count unique characters by removing once found
        for(int i = 0; i < sentence.length(); i++){
            char a = sentence.charAt(i);
            if(list.contains(a)){
                count++;
                list.remove(Character.valueOf(a));
            }
        }
        return count == 26;
    }

    // Approach 2 : Direct String contains check (Optimized)

    public boolean checkIfPangram2(String sentence) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (!sentence.contains(String.valueOf(c)))
                return false;
        }
        return true;
    }
}

/*
Explanation:

This problem checks whether a given sentence contains all 26 lowercase English letters
at least once.

Approach 1 (ArrayList):
- Initialize an ArrayList with all lowercase alphabets.
- Traverse the sentence and check if the character exists in the list.
- If found, increment count and remove the character to avoid duplicate counting.
- At the end, verify if count equals 26.

Time Complexity:
- O(n²) in the worst case due to contains() and remove() operations.

Runtime Observed on LeetCode:
- 4 ms

Approach 2 (String contains):
- Loop through characters from 'a' to 'z'.
- Use String.contains() to check presence of each letter.
- If any letter is missing, return false.

Time Complexity:
- O(26 × n) ≈ O(n)

Runtime Observed on LeetCode:
- 0 ms

Key Takeaway:
Although both approaches are correct, using direct string checks avoids extra data
structures and results in better performance and cleaner code.
*/

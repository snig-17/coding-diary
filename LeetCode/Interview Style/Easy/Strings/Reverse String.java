package Strings;

// 26-08-25

/*
QUESTION:
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.
/*

MY OBSERVATIONS:
- got the logic tried the loop method, but iterations were confusing
*/

/*
FEEDBACK:
class Solution {
    public void reverseString(char[] s) {
        // No need for even/odd check!
        for (int i = 0; i < s.length / 2; i++) {  // ← KEY FIX: i < length/2
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}

*/

//easier method

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move pointers toward center
            left++;
            right--;
        }
    }
}

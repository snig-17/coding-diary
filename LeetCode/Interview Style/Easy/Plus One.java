// 07-08-25

/*
QUESTION:
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.*/

/*
MY OBSERVATIONS:
- understood the basic logic
- forgot to implement carry logic
- didn't handle edge case of all 9's
*/

/*
FEEDBACK:

Never modify the loop variable inside the loop body unless absolutely necessary

*/

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] == 9) {
                digits[i] = 0; // Set to 0, carry continues
            } else {
                digits[i] = digits[i] + 1; // Add 1 and we're done
                return digits;
            }
        }
        
        // If we reach here, all digits were 9
        // Need to create new array with extra digit
        int[] result = new int[digits.length + 1];
        result[0] = 1; // First digit is 1, rest are 0 by default
        return result;
    }
}

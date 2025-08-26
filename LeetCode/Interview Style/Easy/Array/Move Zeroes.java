// 07-08-25

/*
QUESTION:
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
/*
MY OBSERVATIONS:
- understood the logic, 
- failed to implenet within time contstraints
*/

/*
FEEDBACK:
class Solution {
    public void moveZeroes(int[] nums) {
        int writeIndex = 0;
        
        // First pass: Move all non-zero elements to front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[writeIndex++] = nums[i];
            }
        }
        
        // Second pass: Fill remaining positions with zeros
        while (writeIndex < nums.length) {
            nums[writeIndex++] = 0;
        }
    }
}

ALTERNATIVE APPROACH:
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0; // Points to next position for non-zero element
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                // Swap only if positions are different
                if (left != right) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
                left++;
            }
        }
    }
}


*/

class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                // Shift all elements to the left
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                // Put zero at the end
                nums[nums.length - 1] = 0;
                // CRUCIAL: Decrement i to check the same position again
                i--; // The element that moved into position i needs to be checked
            }
        }
    }
}

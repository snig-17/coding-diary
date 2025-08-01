// 01-08-25

/*
QUESTION:
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
*/

/*
MY OBSERVATIONS:
- multiple tries
- read question throughly (didn't ask to rewrite discarded duplicate values)
*/

/*
FEEDBACK:
Time Complexity: O(n²) due to nested shifting operations
Space Complexity: O(1) ✅ (this part is solid!)

much more efficient approach that reduces time complexity from O(n²) to O(n):

class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case: empty array
        if (nums.length == 0) return 0;
        
        // Two-pointer approach
        int writeIndex = 1; // Position to write next unique element
        
        for (int readIndex = 1; readIndex < nums.length; readIndex++) {
            // If current element is different from previous unique element
            if (nums[readIndex] != nums[writeIndex - 1]) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        
        return writeIndex; // Number of unique elements
    }
}

1. Elimination of Nested Loops
2. Smart Pointer Management
3. Cleaner Logic Flow
*/



class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = nums.length;
        
        for (int i = 0; i < k - 1;i++){
            if (nums[i] == nums[i+1]){
                for (int j = i; j < k - 1; j++){
                    nums[j] = nums[j+1];
                }
                k = k - 1;
                i = i - 1;
                
                
            }
        }
        return k;
    }
}
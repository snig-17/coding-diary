// 04-08-25

/*
QUESTION:
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

/*
MY OBSERVATIONS:
- understood the logic, but took time to implement
- my method took too much time, didn't pass time check
*/

/*
FEEDBACK:


class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        
        return false;
    }
}
1. Time Complexity: O(n log n) - better than O(n²)
2. Space Complexity: O(1) - no extra space needed
3. In-place: Modifies original array (consider if this is acceptable)
*/

class Solution {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++){
            int temp = nums[nums.length-1];
            for ( int j = nums.length-1; j >= 1; j--){
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
       
        
    }
}
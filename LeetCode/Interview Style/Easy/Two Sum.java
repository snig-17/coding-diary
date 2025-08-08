// 08-08-25

/*
QUESTION:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
/*
MY OBSERVATIONS:
- understood the logic
- implemented correctly first time
*/

/*
FEEDBACK:
1. Always return early when you find the solution in search problems
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j}; // Early return!
                }
            }
        }
        return new int[]{}; // Edge case handling
    }
}


*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i = 0; i <= nums.length - 1; i++){
            for(int j = i + 1; j<= nums.length - 1; j++){
                if (nums[i] + nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        return output;
    }
}
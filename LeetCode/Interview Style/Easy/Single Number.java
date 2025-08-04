// 04-08-25

/*
QUESTION:
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.*/

/*
MY OBSERVATIONS:
- understood the logic, but couldn't implement
*/

/*
FEEDBACK:
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR magic!
        }
        return result;
    }
}
Why XOR Works:

a ^ a = 0 (any number XOR itself is 0)
a ^ 0 = a (any number XOR 0 is itself)
XOR is commutative: a ^ b ^ c = c ^ a ^ b
*/

class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        
        Arrays.sort(nums);  // Sort first!
        
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        
        return nums[nums.length - 1];  // Single number at the end
    }
}
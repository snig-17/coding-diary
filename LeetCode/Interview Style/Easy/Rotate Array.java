// 03-08-25

/*
QUESTION:
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
*/

/*
MY OBSERVATIONS:
- took time to understand correct logic, but got it first time
- my method took to much time, didn't pass time check
*/

/*
FEEDBACK:


class Solution {
    public void rotate(int[] nums, int k) {
 
        int n = nums.length;
        k = k % n; // Handle k >= n cases
        
        // Three-step reverse process
        reverse(nums, 0, n - 1);        // Reverse entire array
        reverse(nums, 0, k - 1);        // Reverse first k elements  
        reverse(nums, k, n - 1);        // Reverse remaining elements
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}


ALTERNATIVE SOLUTION 1:
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle k > n case
        
        int[] result = new int[n];
        
        // Place elements at their new positions
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }
        
        // Copy back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }
    }
}
ALTERNATIVE SOLUTION 2:
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        
        int count = 0; // Track elements moved
        
        for (int start = 0; count < n; start++) {
            int current = start;
            int prev = nums[start];
            
            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
}
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
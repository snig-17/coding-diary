// 05-08-25

/*
QUESTION:
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
*/

/*
MY OBSERVATIONS:
- understood the logic, but couldn't fix array size issue
*/

/*
FEEDBACK:


public int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    
    int[] temp = new int[Math.min(nums1.length, nums2.length)];
    int i = 0, j = 0, k = 0;
    
    while (i < nums1.length && j < nums2.length) {
        if (nums1[i] < nums2[j]) {
            i++;
        } else if (nums1[i] > nums2[j]) {
            j++;
        } else {
            temp[k++] = nums1[i];
            i++;
            j++;
        }
    }
    
    int[] result = new int[k];
    for (int idx = 0; idx < k; idx++) {
        result[idx] = temp[idx];
    }
    return result;
}

}
1. Time Complexity: O(m log m + n log n) - Much better than O(m×n)
2. Space Complexity: O(1) if sorting in-place is allowed
3. Scalable: Works efficiently even with massive arrays
4. Interview-friendly: Shows advanced algorithmic thinking
5. Clean logic: Easy to understand and debug
*/

public int[] intersect(int[] nums1, int[] nums2) {
    int[] result = new int[Math.min(nums1.length, nums2.length)];
    boolean[] used = new boolean[nums2.length]; // Track used elements in nums2
    int count = 0;
    
    for (int i = 0; i < nums1.length; i++) {
        for (int j = 0; j < nums2.length; j++) {
            if (!used[j] && nums1[i] == nums2[j]) {
                result[count] = nums1[i];
                used[j] = true; // Mark as used
                count++;
                break; // Move to next element in nums1
            }
        }
    }
    
    // Resize array to actual count
    int[] finalResult = new int[count];
    for (int i = 0; i < count; i++) {
        finalResult[i] = result[i];
    }
    
    return finalResult;
}

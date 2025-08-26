// 26-08-25

/*
QUESTION:
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
/*
MY OBSERVATIONS:
- tried different logic, neede help to find one easiest to implement
*/

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // Step 1: Transpose (only swap upper triangle!)
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){  // ← KEY FIX: j starts from i+1
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Step 2: Reflect (reverse each row)
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n/2; j++){  // ← KEY FIX: j < n/2 (not <=)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}

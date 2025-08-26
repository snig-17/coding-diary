package Array;

// 26-08-25

/*
QUESTION:
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
/*
MY OBSERVATIONS:
- don't understand the logic at all, came up with no solution
*/

/*
FEEDBACK:


*/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Track seen numbers for each constraint type
        boolean[][] rows = new boolean[9][9];    // rows[i][num-1] = true if num seen in row i
        boolean[][] cols = new boolean[9][9];    // cols[j][num-1] = true if num seen in col j  
        boolean[][] boxes = new boolean[9][9];   // boxes[boxIdx][num-1] = true if num seen in box
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                
                // Skip empty cells
                if (current == '.') continue;
                
                // Convert char to array index (1-9 becomes 0-8)
                int num = current - '1';
                
                // Calculate 3x3 box index
                int boxIndex = (i / 3) * 3 + (j / 3);
                
                // Check if number already exists in row, column, or box
                if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
                    return false;
                }
                
                // Mark number as seen
                rows[i][num] = true;
                cols[j][num] = true;
                boxes[boxIndex][num] = true;
            }
        }
        
        return true;
    }
}



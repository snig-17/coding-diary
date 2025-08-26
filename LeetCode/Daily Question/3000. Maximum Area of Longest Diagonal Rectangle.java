class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiag = 0;
        int maxArea = 0;
        
        for (int i = 0; i < dimensions.length; i++) {
            double diag = Math.sqrt(dimensions[i][0] * dimensions[i][0] + 
                                  dimensions[i][1] * dimensions[i][1]);
            int area = dimensions[i][0] * dimensions[i][1];
            
            // Update if we find a larger diagonal, OR
            // if diagonal is equal but area is larger
            if (diag > maxDiag || (diag == maxDiag && area > maxArea)) {
                maxDiag = diag;
                maxArea = area;
            }
        }
        
        return maxArea;
        }
    
}
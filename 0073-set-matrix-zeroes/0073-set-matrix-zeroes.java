class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        boolean isFirstRowZero = false;
        boolean isFirstColZero = false;

        // Checking if the first row contains zero
        for(int i=0; i<col; i++) {
            if(matrix[0][i] == 0) {
                isFirstRowZero = true;
                break;
            }
        }

        // Checking if the first column contains zero
        for(int j=0; j<row; j++) {
            if(matrix[j][0] == 0) {
                isFirstColZero = true;
                break;
            }
        }
        
        // Marking the corresponding row and col as zero for tracking
        for(int i=1; i<row; i++) {
            for(int j=1; j<col; j++) {
                if(matrix[i][j]==0) {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        // Now setting zeros
        for(int i=1; i<row; i++) {
            for(int j=1; j<col; j++) {
                if(matrix[i][0]==0 || matrix[0][j]==0) {
                    matrix[i][j]=0;
                }
            }
        }

        if(isFirstRowZero) {
            for(int i=0; i<col; i++) {
                matrix[0][i]=0;
            }
        }

        if(isFirstColZero) {
            for(int j=0; j<row; j++) {
                matrix[j][0]=0;
            }
        }

    }
}
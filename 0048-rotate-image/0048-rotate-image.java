class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] newMatrix = new int[row][col];

        for(int i=0; i<col; i++) {
            for(int j=0; j<row; j++) {
                newMatrix[j][row-i-1] = matrix[i][j];
            }
        }
        for(int i=0; i<col; i++) {
            for(int j=0; j<row; j++) {
                matrix[i][j] = newMatrix[i][j];
            }
        }
        
    }
}
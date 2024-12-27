class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;  //  row * m + col

        int left=0, right=m*n-1;

        while(left <= right) {
            int mid = left + (right-left)/2;
            int row = mid/n;
            int col= mid%n;

            if(target == matrix[row][col]) {
                return true;
            }
            else if(target < matrix[row][col]) {
                right=mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return false;
    }
}
class Solution {
    public int minimumOperations(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int col=0, totalOperations=0;

        for(int j=0; j<n; j++) {
            for(int i=1; i<m; i++) {
                int prev = grid[i-1][j];

                while(grid[i][j]<=prev) {
                    grid[i][j] += 1;
                    totalOperations++;
                }
            }
        }
        return totalOperations;
    }
}
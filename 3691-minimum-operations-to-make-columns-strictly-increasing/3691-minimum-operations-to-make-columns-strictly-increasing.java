class Solution {
    public int minimumOperations(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int totalOperations=0;

        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                int prev = grid[i - 1][j];
                if (grid[i][j] <= prev) {
                    totalOperations += prev - grid[i][j] + 1;
                    grid[i][j] = prev + 1;
                }
            }
        }
        return totalOperations;
    }
}
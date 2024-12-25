class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int size = m*n;

        Set<Integer> elements = new HashSet<>();
        int[] result = new int[2];
        int uniq = 0;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                uniq += grid[i][j];
            }
        }

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(elements.contains(grid[i][j])) {
                    result[0]=grid[i][j];
                    break;
                }
                else elements.add(grid[i][j]);
            }
        }
        int total = size*(size+1)/2;
        int missing = Math.abs(total-uniq+result[0]);
        result[1]=missing;
        return result;

    }
}
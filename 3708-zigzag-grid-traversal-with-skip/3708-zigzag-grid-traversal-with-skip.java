class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        int top=0, bottom=1;
        int row=grid.length;
        int col = grid[0].length;
        List<Integer> elements = new ArrayList<>();

        for(int i=0; i<row; i++) {
            if(i%2 == 0) {
                for(int j=0; j<col; j+=2) {
                    elements.add(grid[i][j]);
                }
            }
            else {
                if(col%2==0) {
                    for(int j=col-1; j>=0; j-=2) {
                        elements.add(grid[i][j]);
                    }
                }
                else {
                    for(int j=col-2; j>=0; j-=2) {
                        elements.add(grid[i][j]);
                    }
                }
            }
        }
        return elements;
    }
}
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for(int row=0; row<numRows; row++) {
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);

            for(int col=1; col<row; col++) {
                currRow.add(triangle.get(row-1).get(col-1)
                + triangle.get(row-1).get(col));
            }

            if(row>0) currRow.add(1);

            triangle.add(currRow);
        }
        return triangle;
    }
}
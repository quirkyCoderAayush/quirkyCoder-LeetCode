class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        int result[][] = new int[intervals.length][2];
        int[] current = intervals[0];
        result[0] = current;
        int index = 0;

        for(int[] interval: intervals) {
            int currentEnd = current[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];

            if(currentEnd >= nextBegin) {
                current[1] = Math.max(currentEnd, nextEnd);
            }
            else {
                current = interval;
                result[++index] = current;
            }
        }
        return Arrays.copyOf(result, index + 1);
    }
}